public class Subsequence {
    public static void main(String[] args) {
        String s1="abcdefgsgs";
        String s2="adgs";

        int i=0;
        int j=0;

        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            else if(j>=s2.length()) break;
            else i++;
        }

        if(j>=s2.length()) System.out.println("Is a subsequence");
        else System.out.println("Not a subsequence");
    }
}
