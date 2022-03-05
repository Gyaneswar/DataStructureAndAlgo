import java.util.*;
public class SizeOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String str[] = s.split(",");

        System.out.println(str.length);
    }
}
