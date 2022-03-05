
//package SepWeek2;
import java.util.*;

public class LargestPlusSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][n];
        int mines[][] = new int[m][2];

        for (int[] e : arr)
            Arrays.fill(e, 1);

        for (int[] e : mines) {
            e[0] = sc.nextInt();
            e[1] = sc.nextInt();
            arr[e[0]][e[1]] = 0;
        }

        int ans = Solve(n, arr);
        System.out.println(ans);
    }

    public static int Solve(int n, int arr[][]) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        int center = n / 2;
        int length = 0;
        if (n % 2 == 1) {
            count = MaxCount(arr, n, center, center);
            if (count > max)
                max = count;
            length = 3;
        } else {
            length = 2;
        }
        int k = 0;
        if (count >= n / 2)
            return count;
        center = center - 1;
        while (true) {
            k++;
            for (int i = center; i < (center + length); i++) {
                count = MaxCount(arr, n, i, center);
                if (count > max)
                    max = count;
                if (count > (n / 2 - k))
                    return count;
            }
            for (int j = center; j < (center + length); j++) {
                count = MaxCount(arr, n, center + length - 1, j);
                if (count > max)
                    max = count;
                if (count > (n / 2 - k))
                    return count;
            }
            for (int i = center; i < (center + length); i++) {
                count = MaxCount(arr, n, i, center + length - 1);
                if (count > max)
                    max = count;
                if (count > (n / 2 - k))
                    return count;
            }
            for (int j = center; j < (center + length); j++) {
                count = MaxCount(arr, n, center, j);
                if (count > max)
                    max = count;
                if (count > (n / 2 - k))
                    return count;
            }
            length = length + 2;
            center = center - 1;
            if (center < 0 || length >= n)
                return max;
        }
    }

    public static int MaxCount(int arr[][], int n, int centerx, int centery) {
        int count = 0;
        if (centerx >= n || centery >= n || centerx < 0 || centery < 0)
            return count;
        if (arr[centerx][centery] != 0) {
            count++;
            Point top = new Point(centerx, centery);
            Point bottom = new Point(centerx, centery);
            Point left = new Point(centerx, centery);
            Point right = new Point(centerx, centery);

            if (!(check(n, top) && check(n, bottom) && check(n, left) && check(n, right)))
                return count;
            while (arr[top.x][top.y] != 0 && arr[bottom.x][bottom.y] != 0 && arr[left.x][left.y] != 0
                    && arr[right.x][right.y] != 0) {
                top.x = top.x;
                top.y = top.y - 1;

                bottom.x = bottom.x;
                bottom.y = bottom.y + 1;

                left.x = left.x - 1;
                left.y = left.y;

                right.x = right.x + 1;
                right.y = right.y;

                if (!(check(n, top) && check(n, bottom) && check(n, left) && check(n, right)))
                    return count;

                if (arr[top.x][top.y] != 0 && arr[bottom.x][bottom.y] != 0 && arr[left.x][left.y] != 0
                        && arr[right.x][right.y] != 0)
                    count++;
            }

        }
        return count;
    }

    public static boolean check(int n, Point p) {
        if (p.x >= n || p.x < 0 || p.y < 0 || p.y >= n)
            return false;
        else
            return true;
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
