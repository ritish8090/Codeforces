import java.util.*;
public class Special_Characters_1948A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                if (n % 2 == 1) {
                    System.out.println("NO");
                    continue;
                }

                System.out.println("YES");

                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < n / 2; i++) {
                    char c = (char) ('A' + i);
                    sb.append(c).append(c);
                }

                System.out.println(sb);
            }
        }
}
