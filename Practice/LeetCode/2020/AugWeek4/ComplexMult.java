//package AugWeek4;

public class ComplexMult {
    public static void main(String[] args) {
        String num1 = "1+-1i";
        String num2 = "1+-1i";

        String num1Integer = "";
        String num1Imaginary = "";
        int i = 0;
        for (i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) == '+') {
                break;
            }
        }
        num1Integer = num1.substring(0, i);
        num1Imaginary = num1.substring(i + 1, num1.length() - 1);
        System.out.println(num1Integer + "----" + num1Imaginary);

        String num2Integer = "";
        String num2Imaginary = "";
        i = 0;
        for (i = 0; i < num2.length(); i++) {
            if (num2.charAt(i) == '+') {
                break;
            }
        }
        num2Integer = num2.substring(0, i);
        num2Imaginary = num2.substring(i + 1, num2.length() - 1);
        System.out.println(num2Integer + "----" + num2Imaginary);

        int int1 = Integer.parseInt(num1Integer);
        int int2 = Integer.parseInt(num2Integer);

        int img1 = Integer.parseInt(num1Imaginary);
        int img2 = Integer.parseInt(num2Imaginary);

        int ansInt = (int1 * int2) + (-1 * (img1 * img2));
        int ansImg = (int1 * img2) + (int2 * img1);

        String ans = ansInt + "+" + ansImg + "i";
        System.out.println(ans);

    }
}
