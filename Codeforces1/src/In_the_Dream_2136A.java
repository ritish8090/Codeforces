import java.util.*;
public class In_the_Dream_2136A {
        static boolean valid(int p, int q) {
            return p <= 2 * q + 2 && q <= 2 * p + 2;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = Integer.parseInt(scanner.nextLine().trim());

            while (t-- > 0) {
                String[] parts = scanner.nextLine().trim().split(" ");
                int a = Integer.parseInt(parts[0]);
                int b = Integer.parseInt(parts[1]);
                int c = Integer.parseInt(parts[2]);
                int d = Integer.parseInt(parts[3]);

                boolean half1 = valid(a, b);
                boolean half2 = valid(c - a, d - b);

                System.out.println(half1 && half2 ? "YES" : "NO");
            }
        }
}
