public class GenerateBinary {
    public static void main(String[] args) {
        int n=1;

        String res="";
        System.out.println(Integer.toBinaryString(n));
        while(n>0){
            res=n%2 + res;
            n=n/2;
        }

        System.out.println(res);
    }
    
}
