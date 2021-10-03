//This is a test class to test certain things about java
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.*;
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
        // Stack<String> st=new Stack<>();
        // String s="+1";
        // String c=Character.toString(s.charAt(0));
        // st.push((String)c);
        // StringBuilder str=new StringBuilder(s);
        // str.delete(1, 2);        
        // System.out.println(str.toString());
        // str.insert(1,'1');
        // System.out.println(str.toString());

        // List<String> arr=new LinkedList<>();
        // arr.add("apple");
        // arr.add("mango");
        // arr.add("orange");

        // arr.remove(1);

        // arr.add("mango");

        // System.out.println(arr.toString());


        // HashSet<String> set=new HashSet<>();
        // set.add("apple");
        // set.add("apple");
        // set.add("mango");
        // set.add("orange");

        // set.remove("apple");
        // set.add("appple");
        // System.out.println(set.toString());

        // for (Iterator<String> it = set.iterator(); it.hasNext();) {
        //     String temp=it.next();
        //     it.remove();
        //     System.out.println(set.toString());
        //     //it.add(temp);
        //     set.add(temp);
        // }

        // StringBuilder str=new StringBuilder("hello");
        // //str.replace(1, 2, "tttt");
        // str.delete(str.length()-1,str.length());

        // String s="hello";
        // System.out.println(s.substring(0,s.length()-1));

        //System.out.println(str.toString());

        //lengthOfLongestSubstring("dvdf");
        //recur("23",0,"");

        // int i=0;
        // StringBuilder str=new StringBuilder("abcd");
        // str.insert(i,"()");
        // System.out.println(str.toString());
        // str.delete(i, i+2);
        // System.out.println(str.toString());
        // str.insert(i+1, "()");
        // System.out.println(str.toString());
        // res=new ArrayList<>();
        // recur(new StringBuilder("()"),1,2);
        // System.out.println(res.toString());

        Scanner sc=new Scanner(System.in);        
        char ch=sc.next().charAt(0);
        char ch1=sc.next().charAt(0);
        System.out.println(ch+"--"+ch1);

        char ch2[][]={{'a','b','c'},{'a','b','c'},{'a','b','c'}};

        char ch3[][]=ch2.clone();

        Arrays.fill(ch2[0],'d');

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(ch3[i][j]+" ");
            }
            System.out.println();
        }

    }
    static List<String> res;
    static HashSet<String> set=new HashSet<>();
    public static void recur(StringBuilder str,int index,int n){
        if(index == n){
            if(set.add(str.toString())){
                res.add(str.toString());
            }
            return;
        }
        
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '('){
                str.insert(i,"()");
                recur(str,index + 1,n);
                str.delete(i,i+2);
                str.insert(i+1,"()");
                recur(str,index + 1,n);
                str.delete(i+1,i+3);
            }
        }
        return;
    }
    
}




