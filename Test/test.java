//This is a test class to test certain things about java
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        //int arr[][]={{1,2},{3,5}};
        //test(arr);

        //System.out.println(6^5);

        //for(int i=0;i<8;i++)
        //System.out.println("|"+String.format("%"+3+"s", Integer.toBinaryString(i)));
        //String str="1";

        
        // ArrayList<Integer> arr=new ArrayList<>();
        // arr.add(0);    
        // arr.add(2);
        // arr.add(1);
        // if(0==0.0)
        // System.out.println(0%10);

        // float a=5;
        // float b=3;
        // float c=a/b;
        // System.out.println(c);


        // HashMap<Integer,Integer> map=new HashMap<>();
        // map.put(2,1);
        // map.put(2,2);
        // map.put(1,1);

        // System.out.println(map.toString());
        
        //String s=map.put('a', 'b');
        //System.out.println(s);
        //System.out.println(ch);
        //char ch1=null;
        //System.out.println(ch1);
        //System.out.println(map.put('a', 'b'));
        //System.out.println(map.put(1, 2));
        //System.out.println(map.put(3, 2));
        // arr.remove(1);
        // System.out.println(arr);

        // long temp=Long.valueOf("814748364888") * -1;

        // System.out.println(temp);


        // int arr[][]={{1,2},{3,5},{4,6}};

        // System.out.println(arr.length);

        // int salary[]={1,2,3,4};
        //double max=Arrays.stream(salary).getAsDouble();
        //System.out.println(max);

        // ArrayList<Integer> arraylist=new ArrayList<>();
        // arraylist.add(1);
        // arraylist.add(2);
        // arraylist.add(3);
        // arraylist.add(4);

        // arraylist.remove(arraylist.size()-1);

        // System.out.println(arraylist.toString());
        
        // String s1="abcd";
        // String s2="bc";

        // System.out.println(s2.compareTo(s1));

        // String s="ABCD";
        // // System.out.println(s.substring(1));
        // // int trees[][]={{1,1},{2,2},{2,0},{2,4},{3,3},{4,2}};

        // // System.out.println(trees[1].length);

        // StringBuilder str=new StringBuilder(s);

        // str.delete(0, 1);
        // System.out.println(str.toString());
        // str.append("A");
        // System.out.println(str.toString());

        // str.delete(str.length()-1, str.length());
        // System.out.println(str.toString());
        // str.insert(1, 'A');
        // System.out.println(str.toString());

        // char ch[]=s.toCharArray();
        // Arrays.sort(ch);
        // String sdfs = String.copyValueOf(ch);
        // System.out.println(sdfs);
        Stack<String> st=new Stack<>();
        String s="+1";
        String c=Character.toString(s.charAt(0));
        st.push((String)c);
        StringBuilder str=new StringBuilder(s);
        str.delete(1, 2);
        System.out.println(str.toString());
    }

    public static void test(int arr[][]){        
            System.out.println(arr[0]);
    }
}




