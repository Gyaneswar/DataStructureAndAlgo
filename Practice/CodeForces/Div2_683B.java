import java.util.*;
public class Div2_683B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();            
            boolean oddFlag=false;
            int min=Integer.MAX_VALUE;
            int sum=0;
            int count=0;
            for(int i=0;i<n;i++){                               
                for(int j=0;j<m;j++){
                    int a=sc.nextInt();                
                    if(a<=0){ count++;a=a*-1; }
                    if(a<min) min=a;
                    
                    sum=sum+a;
                }                       
            }
            if(count%2==1) oddFlag=true;         
            if(oddFlag) sum=sum-(2*min);

            System.out.println(sum);
        }
    }
}
