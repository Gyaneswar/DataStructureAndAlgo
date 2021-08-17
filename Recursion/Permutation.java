import java.util.*;
public class Permutation {
    public static void main(String[] args) {
        String s="ABC";
        char ch[]=s.toCharArray();
        GetAllPermuatations(ch,0);
    }

    public static void GetAllPermuatations(char ch[],int i){
        if(i==ch.length-1){
            System.out.println(String.valueOf(ch));
            return;
        }
        for(int j=i;j<ch.length;j++){
            Swap(ch, i, j);
            GetAllPermuatations(ch, i+1);
            Swap(ch, i, j);
        }
    }

    public static void Swap(char ch[],int i,int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
}
