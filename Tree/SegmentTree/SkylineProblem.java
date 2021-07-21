import java.util.*;
public class SkylineProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of buildings : ");
        int n=sc.nextInt();

        int buildings[][]=new int[n][3];
        for(int i=0;i<n;i++){
            buildings[i][0]=sc.nextInt();
            buildings[i][1]=sc.nextInt();
            buildings[i][2]=sc.nextInt();
        }

        

    }
}
