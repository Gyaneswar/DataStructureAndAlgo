import java.util.*;
public class MinHeapInsert{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];        
        int SIZE=0; 
        int arr1[]={40,20,30,35,25,80,32,100,70,60};
        System.out.println(Arrays.toString(arr1));
        Heapify(arr1, 0);
        for(int i=0;i<=SIZE && i<n;i++){
            arr[i]=sc.nextInt();
            HeapInsert(arr,SIZE);
            SIZE++;
        }     
        Heapify(arr, 0);  
        
    }    
    public static void Heapify(int arr[],int index){
        for(int i=index;
        GetRightChild(i)<arr.length &&
        (arr[i]>arr[GetLeftChild(i)] || arr[i]>arr[GetRightChild(i)]);)
        {        
            if(arr[GetLeftChild(i)]<arr[GetRightChild(i)]){
                Swap(arr, GetLeftChild(i), i);
                i=GetLeftChild(i);
            }else{
                Swap(arr, GetRightChild(i), i);
                i=GetRightChild(i);
            }            
            System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void HeapInsert(int arr[],int SIZE){                       
            for(int i=SIZE;(i>0 && arr[i]<arr[GetParent(i)]);i=GetParent(i)){                         
                if(arr[i]<arr[GetParent(i)]){
                    Swap(arr, GetParent(i), i);                    
                }                
            }        
        System.out.println(Arrays.toString(arr));
    }

    public static void decreaseKey(int arr[],int i){
        while(i!=0 && arr[GetParent(i)]>arr[i]){
            Swap(arr, GetParent(i), i);
            i=GetParent(i);
        }
    }

    public static void Swap(int arr[],int child,int parent){        
        int temp=arr[child];
        arr[child]=arr[parent];
        arr[parent]=temp;
    }



    public static int GetLeftChild(int i){
        return (2*i)+1;
    }
    
    public static int GetRightChild(int i){
        return (2*i)+2;
    }
    
    public static int GetParent(int i){
        return (int)Math.floor((i-1)/2);
    }
}