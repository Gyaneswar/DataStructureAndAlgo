//This is a test class to test certain things about java
import java.util.Arrays;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        //int arr[][]={{1,2},{3,5}};
        //test(arr);

        //System.out.println(6^5);

        //for(int i=0;i<8;i++)
        //System.out.println("|"+String.format("%"+3+"s", Integer.toBinaryString(i)));
        //String str="1";

        
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);    
        arr.add(2);
        arr.add(1);

        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);


        //System.out.println(Arrays.toString(arr));
    }

    public static void test(int arr[][]){        
            System.out.println(arr[0]);
    }
}




