import java.util.*;

public class Div2_377A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();

        int n = k % 10;
        for (int i = 1; i <= 9; i++) {
            int temp = k * i;
            if (temp % 10 == r) {
                System.out.println(i);
                break;
            }
            if (temp % 10 == 0) {
                System.out.println(i);
                break;
            }
        }

    }
}
