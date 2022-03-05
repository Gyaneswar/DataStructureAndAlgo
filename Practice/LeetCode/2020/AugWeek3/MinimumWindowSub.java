import java.util.*;

public class MinimumWindowSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> copy = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
            copy.put(t.charAt(i), copy.getOrDefault(t.charAt(i), 0) + 1);
        }

        int ansi = 0;
        int ansj = 0;
        int m = t.length();
        int ans = Integer.MAX_VALUE;

        int count = t.length();
        int i = 0;
        int j = 0;
        int previ=0;
        int prevj=0;
        while (i <= n - m) {
            previ=i;
            prevj=j;
            char str = ' ';
            if (j < n)
                str = s.charAt(j);
            if (count == 0) {
                int temp = j - i;
                if (temp < ans) {
                    ans = temp;
                    ansi = i;
                    if (j > n)
                        ansj = n;
                    else
                        ansj = j;
                }
                if (map.get(s.charAt(i)) != null && copy.get(s.charAt(i)) < map.get(s.charAt(i))) {
                    copy.put(s.charAt(i), copy.get(s.charAt(i)) + 1);
                    if (copy.get(s.charAt(i)) > 0)
                        count++;
                }
                i++;
            } else {

                if (j < n && count != 0)
                    j++;

                if (map.get(str) != null) {
                    int temp = copy.get(str) - 1;
                    copy.put(str, temp);
                    if (temp >= 0)
                        count--;
                }

                if (previ==i && prevj==j)
                    break;
            }
        }
        if (ans == Integer.MAX_VALUE)
            return "";
        else
            return s.substring(ansi, ansj);
    }
}
