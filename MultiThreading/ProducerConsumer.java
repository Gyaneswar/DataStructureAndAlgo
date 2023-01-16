import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//This concept is useful and used in most of modern multithreaded applications
public class ProducerConsumer {
    private static final int CAPACITY = 10;
    public static void main(String[] args) {
        Queue q = new Queue(CAPACITY);
        Producer p1 = new Producer(q);
        Consumer c1 = new Consumer(q);
        Consumer c2 = new Consumer(q);

        List<Thread> producers = new ArrayList<>();
        List<Thread> consumers = new ArrayList<>();

        for(int i=0;i<CAPACITY/2;i++){
            Thread th = new Thread(new Producer(q));
            th.setName("Producer"+i);
            producers.add(th);
        }
        for(int i=0;i<CAPACITY;i++){
            Thread th = new Thread(new Consumer(q));
            th.setName("Consumer"+i);
            consumers.add(th);
        }

        for(Thread th : consumers)
            th.start();

        for(Thread th : producers)
            th.start();
    }
    private static class Producer implements Runnable{
        Queue q;
        Random random;
        public Producer(Queue q){
            this.q = q;
            this.random = new Random();
        }
        @Override
        public void run() {
            while(true){
                try {
                    Thread.sleep(random.nextInt(5000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    q.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static class Consumer implements Runnable{
        Queue q;
        Random random;
        public Consumer(Queue q){
            this.q = q;
            random = new Random();
        }
        @Override
        public void run() {
            while(true){
                try {
                    Thread.sleep(random.nextInt(5000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    q.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static class Queue{
        private Deque<Integer> queue = new LinkedList<>();
        private int CAPACITY;
        private Random random;
        private Semaphore full;
        private Semaphore empty;
        private Lock lockObj;
        public Queue(int CAPACITY){
            this.CAPACITY = CAPACITY;
            this.random = new Random();
            this.full = new Semaphore(0);
            this.empty = new Semaphore(CAPACITY);
            this.lockObj = new ReentrantLock();
        }
        public void produce() throws InterruptedException {
            empty.acquire();
            Integer x = random.nextInt(100);
            System.out.println(Thread.currentThread().getName()+" : Produced : "+x);
            queue.addLast(x);
            full.release();
        }
        public void consume() throws InterruptedException {
            Integer x = null;
            full.acquire();
            if(this.lockObj.tryLock()){
                try {
                   x = queue.pollFirst();
                }
                finally {
                    lockObj.unlock();
                }
            }
            System.out.println(Thread.currentThread().getName()+" : Consumed : "+x);
            empty.release();
        }
    }
}
