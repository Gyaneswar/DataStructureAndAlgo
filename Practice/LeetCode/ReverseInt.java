import java.util.*;
public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();

        System.out.println(Reverse(x));
    }

    public static int Reverse(int x){
        if(x<0){
            if(x==Integer.MIN_VALUE)
                return 0;
            x=x*-1;
            StringBuilder builder=new StringBuilder(String.valueOf(x));
            builder.reverse();
            long temp=Long.valueOf(builder.toString()) * (-1);
            if(temp<Integer.MIN_VALUE)
                return 0;
            return (int)temp;
        }
        else{
            StringBuilder builder=new StringBuilder(String.valueOf(x));
            builder.reverse();
            long temp=Long.valueOf(builder.toString());
            if(temp>Integer.MAX_VALUE)
                return 0;
            return (int)temp;
        }
    }
}
