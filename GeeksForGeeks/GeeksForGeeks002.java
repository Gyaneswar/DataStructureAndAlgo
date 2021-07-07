//https://www.geeksforgeeks.org/check-if-there-exists-a-pair-a-b-such-that-for-all-the-n-pairs-either-of-the-element-should-be-equal-to-either-a-or-b/
import java.util.*;
public class GeeksForGeeks002 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=4;
        int arr[][]={
            {1,2},
            {7,3},
            {3,4},
            {3,5}
        };

        int first=-1;
        int second=-1;

        int i=0;
        for(int k=0;k<2;k++){    
            first=arr[0][k];        
            for(i=1;i<n;i++){
                if(arr[i][0]==first || arr[i][1]==first)
                    continue;
                else
                    break;                    
            }
        }

        int j=0;
        if(i<n){            
            for(int k=0;k<2;k++){    
                second=arr[i][k];        
                for( j=i;j<n;j++){
                    if(arr[j][0]==second || arr[j][1]==second)
                        continue;
                    else
                        break;                    
                }
            }
        }else{
            j=n;
            second=arr[n-1][0] == first ? arr[n-1][1] : arr[n-1][0];
        }
            

        if(j<n){
            System.out.println("we dont have a answer");            
        }
        else
            System.out.println("{"+first+","+second+"}");

    }
}
