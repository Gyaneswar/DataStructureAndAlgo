//package SepWeek4;

import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> arr = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.next());
        }
        List<String> finalResult = new LinkedList<>();
        finalResult.add("");
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            String e = arr.get(i);
            List<String> temp=new LinkedList<>();
            for (int j = 0; j < finalResult.size(); j++) {                
                String ress=finalResult.get(j);
                String res=ress+e;
                int charr[] = new int[26];
                boolean flag=false;
                for (int k = 0; k < res.length(); k++) {
                    char c = res.charAt(k);
                    int index = (int) c - 97;
                    charr[index]++;
                    if (charr[index] > 1) {flag=true; break;}
                }
                if(!flag){
                    temp.add(res);
                    if(res.length()>max) max=res.length();
                } 
            }
            for(int z=0;z<temp.size();z++){
                finalResult.add(temp.get(z));
            }
        }
        System.out.println(max);        
    }
}
