import java.util.*;
public class CheckForRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s1=sc.next();
        String s2=sc.next();
        //Naive(s1,s2);
        Efficient(s1,s2);

    }   

    public static void Efficient(String s1,String s2){        
        boolean flag=false;
        s1=s1+s1;
        int i=0,j=0;
        int n=s1.length();
        flag=true;
        while(i<n){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }else{
                i++;
                j=0;
            }
            if(j==n){                
                flag=true;
                break;
            }
        }

        if(flag) System.out.println("Is a rotation");
        else System.out.println("Not a rotation");
    }


    public static void Naive(String s1,String s2){
        
        StringBuilder str=new StringBuilder(s1);
        int n=s1.length();
        int rotations=n-1;
        
        int i=0;
        boolean flag=false;
        while(i<rotations){
            char start=str.charAt(0);
            str.delete(0, 1);
            str.append(Character.toString(start));
            
            if(str.toString().equals(s2)){
                flag=true;
                break;
            }
            i++;
        }

        if(flag) System.out.println("Is a rotation");
        else System.out.println("Not a rotation");
    }
}
