import java.util.*;
public class NRectangels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int h=sc.nextInt();
        int n=sc.nextInt();

        int l=w<h?w:h;        
        int r=w*h*n;

        while(r>l+1)
        {
            int mid=(l+r)/2;
            if((mid/w)*(mid/h)<=n){
                l=mid;
            }else{
                r=mid;
            }
        }
        System.out.println(l+1);
    }    
}
