import java.util.*;
public class Div2_268A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        HashSet<Integer> set=new HashSet<>();
        int n=sc.nextInt();
        int p=sc.nextInt();
        for(int i=0;i<p;i++){
            int temp=sc.nextInt();
            set.add(temp);
        }

        int q=sc.nextInt();

        for(int i=0;i<q;i++){
            int temp=sc.nextInt();
            set.add(temp);
        }

        boolean flag=false;

        for(int i=1;i<=n;i++){
            if(set.add(i)){
                System.out.println("Oh, my keyboard!");
                flag=true;
                break;
            }
        }

        if(!flag)
            System.out.println("I become the guy.");


    }
}
