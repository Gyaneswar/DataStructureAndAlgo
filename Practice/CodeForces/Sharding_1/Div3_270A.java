import java.util.*;

public class Div3_270A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int i=4;
        int j=n-i;
        while(true){
            if(!CheckPrime(i) && !CheckPrime(j)){
                System.out.println(i+" "+j);
                break;
            }
            i++;
            j=n-i;
        }
    }

    public static boolean CheckPrime(int n){
        if(n==1 || n==2 || n==3)
            return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
