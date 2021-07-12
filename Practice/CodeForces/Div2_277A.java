import java.util.*;
public class Div2_277A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        long n=sc.nextLong();

        if(n%2==0){
            System.out.println(n/2);
        }else{        
            System.out.println(n/2-n);
        }

    }

    public static long SumAP(long n,int a,int d){
        double n2=(double)n/2;
        double cal=n2*(double)(2*a+(n-1)*d);

        return (long)cal;
    }
}
