import java.util.*;
public class Div3_26A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int j=2;j<=n;j++){        
        int n1=j;
        for(int i=2;i*i<=n1;i++){
            while(n1%i==0){
                set.add(i);
                n1=n1/i;
            }
        }
        if(n1>1)
            set.add(n1);
        if(set.size()==2)
            count++;
        set.clear();
        }
        System.out.println(count);
    }
}
