import java.util.*;

public class Div2_375A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();

        int arr[]={x,y,z};
        Arrays.sort(arr);

        int distance=(arr[1]-arr[0])+(arr[2]-arr[1]);

        System.out.println(distance);
        
        
    }
}
