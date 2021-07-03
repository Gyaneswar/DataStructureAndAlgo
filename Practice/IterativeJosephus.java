import java.util.ArrayList;
import java.util.Scanner;

public class IterativeJosephus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int n=sc.nextInt();
        int k=sc.nextInt();

        for(int i=0;i<n;i++)
            arr.add(i);
        int sur=0;
        int kk=0;        
            for(int i=0;i<arr.size();i=(i+1)%(arr.size())){
                kk++;
                if(kk==k){
                    arr.remove(i);
                    n=n-1;
                    kk=1;
                }
                if(n==1)
                    break;
            }                    

        System.out.println(arr.get(0));
    }    
}
