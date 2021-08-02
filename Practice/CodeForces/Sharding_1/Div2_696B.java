import java.util.*;
public class Div2_696B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        boolean isPrime[]=new boolean[100000];        
        Arrays.fill(isPrime, true);
        sievePrime(isPrime);
 
        while(t-->0){
 
            int d=sc.nextInt();
            int temp=1+d;            
            long ans=1;
            int count=0;
            boolean check=false;
            int first=0;
            for(int i=temp;i<100000;i++){                
                if(isPrime[i]){
                    if(check==false){
                        first=i;
                        check=true;
                    }
                    ans=ans*i;
                    count++;
                    i=i+d-1;
                }
                if(count==2) break;
            }       
            long difans=(long)Math.pow(first, 3);     
            System.out.println(ans<difans?ans:difans);
        }
    }
 
        public static void sievePrime(boolean isPrime[]){
            isPrime[0]=false;isPrime[1]=false;
            for(int i=2;i*i<=100000;i++){
                if(isPrime[i]){                                
                    for(int j=2*i;j<100000;j=j+i){
                        isPrime[j]=false;
                    }
                }
            }
        }
}