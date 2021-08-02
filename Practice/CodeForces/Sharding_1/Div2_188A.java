import java.util.*;
public class Div2_188A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();

        long mido=0;
        long mide=0;

        if(n%2==0){
            mido=n/2;
            mide=n/2;
        }
        else{
            mido=(n/2)+1;
            mide=n/2;
        }

        if(k>mido){
            long ele=k-mido;
            long tn=2+(ele-1)*2;
            System.out.println(tn);
        }else{
            long tn=1+(k-1)*2;
            System.out.println(tn);
        }

    }
}
