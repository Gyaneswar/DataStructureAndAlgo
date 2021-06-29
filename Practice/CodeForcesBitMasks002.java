//https://codeforces.com/problemset/problem/202/A

import java.util.Scanner;

public class CodeForcesBitMasks002 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //my logic here is to find the powerset and check if they are palindrome or not and then find the greatest;
        int len=s.length();
        int size=(int)Math.pow(2,len);

        String greatest="";
        for(int k=0;k<size;k++){            
            String bin=String.format("%"+len+"s", Integer.toBinaryString(k));
            String word="";
            for(int i=0;i<len;i++){
                if(bin.charAt(i)=='1')
                    word=word+s.charAt(i);
            }
            boolean isPallindrome=Pallindrome(word);
            //System.out.println(word);

            if(isPallindrome && word.compareTo(greatest)>0)
                greatest=word;
        }
        System.out.println(greatest);
   }
   
   public static boolean Pallindrome(String word){

        StringBuilder builder = new StringBuilder(word);
        if(builder.reverse().toString().equals(word)){
            //System.out.println(word);
            return true;
        }
            
        else
            return false;
   }
}
