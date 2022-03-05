package AugWeek2;
import java.util.*;

public class ArrayOfDoubledPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        System.out.println(canReorderDoubled(arr));

    }

    public static boolean canReorderDoubled(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){            
            if(arr[i]==0) count++;
            if(map.get(arr[i])==null) map.put(arr[i], 1);
            else{int val=map.get(arr[i]); map.put(arr[i], ++val);}
        }

        if(count%2!=0) return false;

        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int temp=arr[i];                       
            if(map.get(temp)!=null){                         
                if(temp>=0)
                    temp=temp*2;
                    
                if(map.get(temp)==null || (temp%2!=0 && temp<0 && map.get(temp/2)==null))
                    return false;                
                else{
                    int val=map.get(temp);
                    if(val==1) map.remove(temp);
                    else map.put(temp,--val);

                    val=map.get(temp/2);
                    if(val==1) map.remove(temp/2);
                    else map.put(temp/2,--val);
                }
            }
        }

        return true;
    }
}
