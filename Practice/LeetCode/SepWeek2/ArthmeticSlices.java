//package SepWeek2;

import java.util.*;
public class ArthmeticSlices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int x=arr[i];
            for(int j=i+1;j<n;j++){
                int y=arr[j];
                int diff=y-x;
                int prev=y;
                for(int k=j+1;k<n;k++){
                    if((arr[k]-prev) == diff){
                        if(prev==arr[k]) count++;
                        count++;
                        prev=arr[k];                        
                    }
                }
            }
        }

        System.out.println(count);
    }
}
