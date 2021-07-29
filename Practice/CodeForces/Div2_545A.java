import java.util.*;
public class Div2_545A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int twos=0;
        int ones=0;
        int max=Integer.MIN_VALUE;
        int temp=0;
        boolean twoFlag=false;
        boolean oneFlag=false;
        int k=0;
        while(k<n){
            
                while(k<n && arr[k]==2){
                    twos++;
                    k++;
                    twoFlag=true;
                }

                if(oneFlag && twoFlag){
                    temp=Math.min(twos, ones)*2;
                    if(temp>max)    max=temp;
                    oneFlag=false; ones=0;
                }
            
                while(k<n && arr[k]==1){
                    ones++;
                    k++;
                    oneFlag=true;
                }
            
                if(oneFlag && twoFlag){
                    temp=Math.min(twos, ones)*2;
                    if(temp>max)    max=temp;
                    twos=0; twoFlag=false;
                }            
        }
        System.out.println(max);
    }
}
