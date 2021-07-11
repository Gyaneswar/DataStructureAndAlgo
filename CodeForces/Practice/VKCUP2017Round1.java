import java.util.*;
public class VKCUP2017Round1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int l=sc.nextInt();
        int b=sc.nextInt();

        int years=0;
        while(l<=b){
            l=l*3;
            b=b*2;
            years++;
        }

        System.out.println(years);

    }
}
