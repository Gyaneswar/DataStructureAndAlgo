import java.util.Arrays;

public class MergeOverlappingInterval {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{3,3},{2,4},{5,7},{6,8}};

        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));

        int start = arr[0][0];
        int end = -1;
        boolean flag = false;
        for(int i=1;i<arr.length;i++){            
            if(arr[i][0] <= arr[i-1][1]){
                end = arr[i][1];
                flag= true;
            }else{
                System.out.println("["+start+", "+end+"]");
                start = arr[i][0];
                end = -1;
                flag = false;
            }
        }

        if(flag){
            end = arr[arr.length-1][1];
            System.out.println("["+start+", "+end+"]");
        }

        for(int i=0;i<arr.length;i++)
            System.out.println(Arrays.toString(arr[i]));
    }
    
}
