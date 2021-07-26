import java.util.*;
public class Div3_731C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){

            int k=sc.nextInt();
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[m];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++){
                b[i]=sc.nextInt();
            }
            
            int i=0;
            int j=0;

            boolean flag=false;
            int ans[]=new int[n+m];
            int ansCounter=0;
            while(i<n && j<m){
                int ai=a[i];
                int bj=b[j];

                int previ=i;
                int prevj=j;
                while(ai==0){
                    ans[ansCounter++]=0;
                    k++;
                    i++;
                    if(i<n)
                        ai=a[i];
                    else break;
                }           
                while(bj==0){
                    ans[ansCounter++]=0;
                    k++;
                    j++;
                    if(j<m)
                        bj=b[j];
                    else break;
                }   

                if(ai!=0 && ai<=k){
                    ans[ansCounter++]=ai;
                    i++;                    
                }
                if(bj!=0 && bj<=k){
                    ans[ansCounter++]=bj;
                    j++;
                }

                if(previ==i && prevj==j){
                    flag=true;
                    break;
                }
                
            }
            if(flag){
                System.out.println(-1);
            }else{
                flag=false;
                if(i!=n){
                    for(int z=i;z<n;z++){
                        int az=a[z];
                        if(az==0) {k++; ans[ansCounter++]=0;}
                        else if(az!=0 && az>k){flag=true; break;}
                        else if(az!=0){ans[ansCounter++]=az;}
                    } 

                }else if(j!=m){
                    for(int z=j;z<m;z++){
                        int bz=b[z];
                        if(bz==0) {k++; ans[ansCounter++]=0;}
                        else if(bz!=0 && bz>k){flag=true; break;}
                        else if(bz!=0){ans[ansCounter++]=bz;}
                    }                    
                }
                if(flag) System.out.println(-1);
                else {
                    for(int z=0;z<n+m;z++) System.out.print(ans[z]+" ");
                }
            }
            //System.out.println();

        }
    }
}
