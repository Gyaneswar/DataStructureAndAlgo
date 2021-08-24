import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            long n=sc.nextLong();

            double check=(double)Math.sqrt(n);
            if(check%1==0){
                System.out.println((long)(check)+" "+1);
            }else{
                long low=(long)Math.pow((long)check,2);
                long high=(long)Math.pow((long)check+1,2);
                
                long middle=low+1+(high-low)/2;

                if(n==middle) System.out.println((long)(check+1)+" "+(long)(check+1));
                else if(n<middle) System.out.println((n-low)+" "+(long)(check+1));
                else System.out.println((long)(check+1)+" "+(high+1-n));
            }

        }
    }
}
