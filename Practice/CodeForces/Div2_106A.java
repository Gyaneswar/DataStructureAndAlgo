import java.util.*;
public class Div2_106A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=new int[12];        
        for(int i=0;i<12;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int grow=0;
        int ans=0;
        for(int i=11;i>=0;i--){
            if(grow<k){
                grow=grow+arr[i];
                ans++;
            }else break;
        }

        if(grow<k) System.out.println(-1);
        else System.out.println(ans);
    }
}
