public class toh{
    public static void main(String[] args) {
        tohfun(3,"A", "B", "C");
    }
    public static void tohfun(int n,String a,String b,String c){
        if(n==1){
            System.out.println("move from "+a+ "to"+ c);            
            return;
        }
            
        tohfun(n-1,a, c, b);
        System.out.println("move from "+a+"to"+c);
        tohfun(n-1,b, a, c);
    }
}