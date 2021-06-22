public class AddWithoutPlus{
    public static void main(String[] args) {
        int x=5;
        int y=7;        
        while(y!=0){
            int carry=x&y;
            x=x^y;
            y=carry<<1;
        }
        System.out.println(x);
    }
}