import java.util.*;
public class Div3_702B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int c0=0,c1=0,c2=0;
            for(int i=0;i<n;i++) 
            {
                arr[i]=sc.nextInt();
                if(arr[i]%3==0) c0++;
                if(arr[i]%3==1) c1++;
                if(arr[i]%3==2) c2++;
            }
            int average=n/3;
            int ans=0;
            if(c0==c1 && c1==c2){
                ans=0;
            }
            else if(c0==c1){                
                if(c0>average){
                    int a=c0-average;
                    int b=c1-average;
                    ans=a*2+b;
                }else{
                    int a=average-c0;
                    int b=average-c1;
                    ans=b*2+a;
                }              
            }
            else if(c1==c2){
                if(c1>average){
                    int a=c1-average;
                    int b=c2-average;
                    ans=a*2+b;
                }else{
                    int a=average-c1;
                    int b=average-c2;
                    ans=a*2+b;
                }   
            }
            else if(c0==c2){
                if(c0>average){
                    int a=c0-average;
                    int b=c2-average;
                    ans=b*2+a;
                }else{
                    int a=average-c0;
                    int b=average-c2;
                    ans=b+a*2;
                }  
            }
            else if(c0>c1 && c0>c2){
                if(c1>average && c2<average){
                    int requireda=c1-average;
                    int requiredb=c0-average;
                    ans=requireda+2*requiredb;
                }   
                else if(c2>average && c1<average){
                    int requireda=c2-average;
                    int requiredb=c0-average;
                    ans=2*requireda+requiredb;
                }   
                else{          
                int requireda=average-c1;
                int requiredb=average-c2;
                ans=requireda+(requiredb*2);
                }
            }
            else if(c1>c0 && c1>c2){  
                if(c0>average && c2<average){
                    int requireda=c0-average;
                    int requiredb=c1-average;
                    ans=2*requireda+requiredb;
                }else if(c2>average && c0<average){
                    int requireda=c2-average;
                    int requiredb=c1-average;
                    ans=requireda+2*requiredb;
                }else{                
                int requireda=average-c0;
                int requiredb=average-c2;
                ans=requireda*2+requiredb;
                }
            }
            else if(c2>c1 && c2>c0){                        
                if(c1>average && c0<average){
                    int requireda=c1-average;
                    int requiredb=c2-average;
                    ans=2*requireda+requiredb;                
                }
                else if(c0>average && c1<average){
                    int requireda=c0-average;
                    int requiredb=c2-average;
                    ans=requireda+2*requiredb;
                }
                else{
                int requireda=average-c1;
                int requiredb=average-c0;
                ans=requireda*2+requiredb;
                }
            }
            System.out.println(ans);
        }
    }
}
