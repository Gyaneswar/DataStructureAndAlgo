import java.util.Comparator;
import java.util.PriorityQueue;

class ConcurrentProgramming {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        SharedData x = new SharedData(arr, 0);
        Thread thread2 = new Thread(){
            public void run(){
                try {
                    x.addEven();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        thread2.start();

        Thread thread1 = new Thread(){
            public void run(){
                try {
                    x.addOdd();
                } catch (InterruptedException e) {                    
                    e.printStackTrace();
                }
            }
        };
        thread1.start();
    }
}

class SharedData {
    private int arr[];
    private int index;    

    public SharedData(int arr[], int index) {
        this.arr = arr;
        this.index = index;        
    }

    public int getIndex() {
        return index;
    }

    public synchronized void addOdd() throws InterruptedException {
        while (true) {
            if (this.index >= arr.length)
                return;
            if (this.index % 2 != 0)
                wait();
            if (this.index >= arr.length)
                return;
            System.out.print(arr[index] + " ");
            this.index += 1;
            notify();
        }
    }

    public synchronized void addEven() throws InterruptedException {
        while (true) {
            if (this.index >= arr.length)
                return;
            if (this.index % 2 == 0)
                wait();
            if (this.index >= arr.length)
                return;
            System.out.print(arr[index] + " ");
            this.index += 1;
            notify();
        }
    }
}