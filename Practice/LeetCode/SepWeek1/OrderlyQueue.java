//package SepWeek1;
import java.util.*;
public class OrderlyQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        str=new StringBuilder(s);
        set=new HashSet<>();
        result=s;
        ArrayList<Character> arr=new ArrayList<>();
        if (k == 1)
            FindLowest(k, str);
        else {

            for (int i = 0; i < s.length(); i++) {
                arr.add(s.charAt(i));
            }

            Collections.sort(arr);
            str.setLength(0);
            for(int i=0;i<s.length();i++){
                str.append(arr.get(i));
            }
            result=str.toString();
        }
        System.out.println(result);
    }
    static StringBuilder str;
    static HashSet<String> set;
    static String result;

    public static void FindLowest(int k,StringBuilder str){
        if(set.contains(str.toString())){
            return;
        }

        set.add(str.toString());
        if(str.toString().compareTo(result)<0){
            result=str.toString();
        }

        for(int i=0;i<k;i++){
            str.append(str.charAt(i));
            str.delete(i, i+1);

            FindLowest(k, str);

            char a=str.charAt(str.length()-1);
            str.delete(str.length()-1, str.length());
            str.insert(i, a);
        }
    }
}
