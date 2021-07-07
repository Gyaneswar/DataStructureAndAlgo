//https://codeforces.com/problemset/problem/1525/A
import java.util.*;
public class CodeForces800_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        while(n>0){            
            int percent=sc.nextInt();            
            int i=0;
            for(i=1;i<100;i++){
                double temp=(double)percent/100 * i;
                double diff=temp-Math.floor(temp);
                if(  diff<Math.pow(10, -5) || diff> 0.99999){
                    break;
                }
                //System.out.println(i+":"+temp);
            }           
            System.out.println(i);
            n--;
        }

    }
}