import java.util.*;
public class carnival_wheel_2180a {
        static int gcd(int x, int y) {
            while (y != 0) {
                int r = x % y;
                x = y;
                y = r;
            }
            return x;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int l = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();

                int g = gcd(l, b);

                int maxPrize = a + ((l - 1 - a) / g) * g;
                System.out.println(maxPrize);
            }
            sc.close();
        }
}
