import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//Lock lesson
public class Sync {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        SharedObj obj = new SharedObj(arr);
        Controller1 thread1 = new Controller1(obj);
        Controller2 thread2 = new Controller2(obj);
        thread1.start();
        thread2.start();
    }
    private static class Controller1 extends Thread{
        SharedObj obj;
        Random random;
        public Controller1(SharedObj obj){
            this.random = new Random();
            this.obj = obj;
        }
        public void run(){
            boolean flag = true;
            while(flag){
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag = obj.print();
            }
            System.out.println("Dead : "+this.getName());
        }
    }
    private static class Controller2 extends Thread{
        SharedObj obj;
        Random random;
        public Controller2(SharedObj obj){
            this.random = new Random();
            this.obj = obj;
        }
        public void run(){
            boolean flag = true;
            while(flag){
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag = obj.print();
            }
            System.out.println("Dead : "+this.getName());
        }
    }
    private static class SharedObj{
        private Lock lockObject;
        int arr[];
        int index;
        public SharedObj(int arr[]){
            this.lockObject = new ReentrantLock();
            this.arr = arr;
            index = 0;
        }
        public boolean print(){
            if(lockObject.tryLock()){
                try{
                    if(index >= arr.length)
                        return false;
                    System.out.println(arr[index]+" : "+Thread.currentThread().getName());
                    index++;
                    return true;
                }finally {
                    lockObject.unlock();
                }
            }
            return false;
        }
    }
}