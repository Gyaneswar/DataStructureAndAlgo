import java.util.Scanner;

public class Div2_350A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int constant=n/7 * 2;
        int remain=n%7;
        int max=0;
        if(remain==1)
            max=constant+1;
        else
            max=constant+(remain>=2?2:0);            
        int min=constant+(remain>=6?1:0);

        System.out.println(min + " "+ max);
    }
}
