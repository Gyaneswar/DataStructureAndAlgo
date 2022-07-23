import java.util.*;
class LeetCode_1048 {
    public static void main(String[] args) {
        String words[]= {"ksqvsyq","ks","kss","czvh","zczpzvdhx","zczpzvh","zczpzvhx","zcpzvh","zczvh","gr","grukmj","ksqvsq","gruj","kssq","ksqsq","grukkmj","grukj","zczpzfvdhx","gru"};
        int res = new LeetCode_1048().longestStrChain(words);
        System.out.println(res);
    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words,new Comparator<String>(){
           public int compare(String s1,String s2){
               return s1.length() - s2.length();
           } 
        });
                
        System.out.println(Arrays.toString(words));     
        return recur(words,0)+1;
    }
    
    
    public int recur(String[] words, int currIndex){
        
        if(currIndex == words.length){
            return 0;
        }
                
        
        int select = 0,notSelect = 0;
        for(int i=currIndex+1;i<words.length;i++){            
            if(countDiff(words[currIndex],words[i])){                
                System.out.print(words[currIndex]+" : "+words[i]+" :-> ");                
                select = Math.max(select,1 + recur(words,i));            
            }                            
        }                
        notSelect = recur(words,currIndex + 1);
        
        System.out.println();
        return Math.max(select,notSelect);
        
    }
    
    
    public boolean countDiff(String s1,String s2){    
        
        if(s1.length() == s2.length())
            return false;
        
        //assuming s2 will always be larger than s1
        if(Math.abs(s1.length() - s2.length()) > 1)
            return false;
        
        
        int i = 0,j = 0,count = 0;
        
        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i) != s2.charAt(j)){
                count++;
                j++;
                if(count > 1)
                    return false;
            }
            else{
                i++;
                j++;
            }
        }
        return true;
    }
}