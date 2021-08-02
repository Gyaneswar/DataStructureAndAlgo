import java.util.*;

public class GoodBye2016 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int timeLeft=240;
        int problems=0;
        int mul=1;
        while(timeLeft>=k && n>0){
            int solve=5*mul;
            timeLeft=timeLeft-solve;
            mul++;
            problems++;
            n--;
        }
        if(timeLeft<k)
        System.out.println(--problems);
        else
        System.out.println(problems);
    }
}
