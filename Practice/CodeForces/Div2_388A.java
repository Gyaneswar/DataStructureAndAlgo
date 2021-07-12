import java.util.*;
public class Div2_388A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        boolean prime[]=new boolean[n+1];
        Arrays.fill(prime, true);
        Process(prime,n);

        CheckSum(n);

    }

    public static void CheckSum(int sum){        
        ArrayList<Integer> arr=new ArrayList<>();
        while(sum!=0){
            if(sum==3){
                arr.add(3);
                sum=sum-3;                
            }else{
                arr.add(2);
                sum=sum-2;
            }            

        }

        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++)
            System.out.print(arr.get(i)+" ");
    }






    public static void Process(boolean prime[],int n){
        prime[0]=false;
        prime[1]=false;

        int i=2;
        while(i<=n){
            if(prime[i]){
                int j=i;
                while(j+i<=n){
                    j=j+i;
                    prime[j]=false;
                }                
            }
            i++;
        }
    }
}
