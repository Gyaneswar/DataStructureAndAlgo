import java.util.*;

public class GetAllSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        findsubsequences(s,"");
        System.out.println(al.toString());
    }

    static ArrayList<String> al=new ArrayList<>();
    public static void findsubsequences(String s,String ans){
        if (s.length() == 0) {
            al.add(ans);
            return;
        }        
        findsubsequences(s.substring(1), ans + s.charAt(0));
        findsubsequences(s.substring(1), ans);
    }

}
