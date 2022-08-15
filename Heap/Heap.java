import java.util.Arrays;

class Heap {
    public static void main(String[] args) {
        MinHeap pq = new MinHeap();
        pq.insert(40);
        pq.insert(15);
        pq.insert(50);
        pq.insert(55);
        System.out.println(pq.extractMin());
        System.out.println(pq.extractMin());
        System.out.println(pq.extractMin());
        pq.insert(10);
        pq.insert(20);        
        System.out.println(pq.extractMin());
        System.out.println(pq.extractMin());
        pq.insert(5);
        pq.insert(30);        
        System.out.println(pq.extractMin());
        System.out.println(pq.extractMin());
        System.out.println(pq.extractMin());
        
    }
}

class MinHeap{
    private int arr[];
    private int index;
    private int capacity;
    public MinHeap(){
        this.index = -1;
        this.arr = new int[100];
        this.capacity = 100;
    }
    public MinHeap(int size){
        this.index = -1;
        this.arr = new int[size];
        this.capacity = 100;
    }

    public boolean insert(int ele){
        try{
            this.arr[++index] = ele;                    
            checkParent(index);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }        
        return true;
    }

    public int extractMin(){
        if(index == -1)
        {
            System.out.println("Empty dewd");
            return -1;
        }
        //System.out.println("Index : "+index);
        int result = arr[0];
        arr[0] = arr[index];        
        this.index = this.index - 1;
        heapify(0);
        return result;
    }

    private void heapify(int pos){
        while(pos <= index && ((leftChild(pos) <= index && arr[leftChild(pos)] < arr[pos] ) ||( rightChild(pos) <= index && arr[rightChild(pos)] < arr[pos]))){
            if(arr[leftChild(pos)] < arr[rightChild(pos)])
            {
                swap(leftChild(pos),pos);
                pos = leftChild(pos);
            }else if(arr[rightChild(index)] < arr[leftChild(pos)]){
                swap(rightChild(pos), pos);
                pos = rightChild(pos);
            }
        }
    }

    private void checkParent(int pos){        
        while(getParent(pos) >=0 && arr[getParent(pos)] > arr[pos]){
            swap(getParent(pos),pos);
            pos = getParent(pos);
        }
    }

    private void swap(int index1,int index2){
        int temp = this.arr[index1];
        this.arr[index1] = this.arr[index2];
        this.arr[index2] = temp; 
    }
    private int leftChild(int parentIndex){
        return (2 * parentIndex)+1;
    }

    private int rightChild(int parentIndex){
        return (2 * parentIndex)+2;
    }

    private int getParent(int childIndex){
        return (childIndex-1)/2;
    }

}
