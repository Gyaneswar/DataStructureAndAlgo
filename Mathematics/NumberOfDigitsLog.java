public class NumberOfDigitsLog {
    public static void main(String[] args) {
        int n=1234;

        int no=(int)Math.floor((double)(Math.log(n)/Math.log(10))+1);

        System.out.println(no);

    }
}
