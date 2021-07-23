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

        System.out.println(getSkyline(buildings).toString());

    }
    public static ArrayList<ArrayList<Integer>> getSkyline(int[][] buildings) {
        int n=buildings[buildings.length-1][1]+1;
        int arr[]=new int[n];
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        for(int i=0;i<buildings.length;i++){
            for(int j=buildings[i][0];j<=buildings[i][1];j++){
                arr[j]=Math.max(arr[j],buildings[i][2]);
            }
        }
        int prev=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=prev){
                ArrayList<Integer> a1=new ArrayList<Integer>();
                if(prev>arr[i]){
                    a1.add(i-1);
                    a1.add(arr[i]);                    
                }else{
                    a1.add(i);
                    a1.add(arr[i]);                    
                }                
                result.add(a1);
            }
            prev=arr[i];
        }

        ArrayList<Integer> a1=new ArrayList<Integer>();
        a1.add(buildings[buildings.length-1][1]);
        a1.add(0); 
        result.add(a1);

        return result;
    }
}
