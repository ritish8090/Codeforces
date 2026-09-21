import java.util.*;
public class Channel_1863A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int a = sc.nextInt();
                int q = sc.nextInt();

                String s = sc.next();

                int online = a;
                int maxOnline = a;

                for (char c : s.toCharArray()) {
                    if (c == '+') {
                        online++;
                    } else {
                        online--;
                    }

                    maxOnline = Math.max(maxOnline, online);
                }

                if (a == n || maxOnline >= n) {
                    System.out.println("YES");
                } else if (a + countPlus(s) < n) {
                    System.out.println("NO");
                } else {
                    System.out.println("MAYBE");
                }
            }
        }

        static int countPlus(String s) {
            int count = 0;

            for (char c : s.toCharArray()) {
                if (c == '+') {
                    count++;
                }
            }

            return count;
        }
}
