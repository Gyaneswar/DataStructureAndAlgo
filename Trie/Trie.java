import java.util.Arrays;
import java.util.Scanner;

public class Trie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of words to preprocess : ");
        int n=sc.nextInt();
        String arr[]=new String[n];

        System.out.println("Enter the words : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }

        TrieNode root=new TrieNode();
        Processor(arr, root);

        while(true){
            System.out.print("Enter the pattern to search (exit to quit) : ");
            String pattern=sc.next();
            if(pattern.equals("exit"))
                break;
            System.out.println(Search(pattern,root));
        }
        
    }

    public static boolean Search(String pattern,TrieNode root){
        TrieNode cursor=root;
        for(int i=0;i<pattern.length();i++){
            int index=(int)pattern.charAt(i)-97;
            if(cursor.ch[index]==null)
                return false;
            else
                cursor=cursor.ch[index];
        }
        if(cursor.isComplete)
            return true;
        else 
            return false;
    }

    public static void Delete(String word,TrieNode root){
        boolean temp=false;
        TrieNode cursor=root;
        int index=0;
        for(int i=0;i<word.length();i++){
            index=(int)word.charAt(i)-97;
            if(cursor.ch[index]!=null){
                cursor=cursor.ch[index];
            }
            else{
                return;
            }                        
        }
        for(int i=0;i<26;i++){
            if(cursor.ch[i]!=null)
                return;
        }
        

    }


    public static void Processor(String arr[],TrieNode root){
        for(int i=0;i<arr.length;i++){
            Process(arr[i], root);
        }
    }

    public static void Process(String str,TrieNode root){
        TrieNode cursor=root;
        for(int i=0;i<str.length();i++){
            int index=(int)str.charAt(i)-97;
            if(cursor.ch[index]==null){
                TrieNode n1=new TrieNode();
                cursor.ch[index]=n1;
                cursor=cursor.ch[index];
            }
            else if(cursor.ch[index]!=null){  //	'\u0000' denotes default value of char in java
                cursor=cursor.ch[index];
            }            
        }
        cursor.isComplete=true;
    }

}

class TrieNode{
    TrieNode []ch=new TrieNode[26];
    boolean isComplete;
}