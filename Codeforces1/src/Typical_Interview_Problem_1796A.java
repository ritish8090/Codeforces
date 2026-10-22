import java.util.*;
public class Typical_Interview_Problem_1796A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            StringBuilder fb = new StringBuilder();

            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    fb.append('F');
                }
                if (i % 5 == 0) {
                    fb.append('B');
                }
            }

            String pattern = fb.toString();

            while (t-- > 0) {
                int k = sc.nextInt();
                String s = sc.next();

                System.out.println(pattern.contains(s) ? "YES" : "NO");
            }

            sc.close();
        }
}
