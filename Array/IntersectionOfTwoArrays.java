import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = { 3, 5, 10, 10, 10, 15 };
        int arr2[] = { 5, 10, 10, 15, 30 };

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                i++;
            }
            if (arr1[i] > arr2[j]) {
                j++;
            }
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
    }
}