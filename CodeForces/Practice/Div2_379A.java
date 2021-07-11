import java.util.*;
public class Div2_379A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String s=sc.next();
        int anton=0,danik=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A')
            anton++;
            else
            danik++;
        }

        if(anton==danik)
        System.out.println("Friendship");
        else
        System.out.println(anton>danik?"Anton":"Danik");


    }
}
