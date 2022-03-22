import java.util.Scanner;
import java.util.Arrays;

public class Div2_238A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        for(int val: arr)
            System.out.print(val+" ");

        System.out.println();
    }
    
}
