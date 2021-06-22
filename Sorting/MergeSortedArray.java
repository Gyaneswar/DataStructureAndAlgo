import java.util.*;
public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }

        int ans[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                ans[k]=arr1[i];
                i++;
                k++;
            }else{
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }

        while(i<n1){
            ans[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            ans[k]=arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(ans));
    }
    
}
