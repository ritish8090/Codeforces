import java.util.*;
public class Add_or_XOR_2119A {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                long a = sc.nextLong();
                long b = sc.nextLong();
                long x = sc.nextLong();
                long y = sc.nextLong();

                if (a == b) {
                    System.out.println(0);
                    continue;
                }

                if (a > b) {

                    if (a == b + 1 && (a % 2 == 1)) {
                        System.out.println(y);
                    } else {
                        System.out.println(-1);
                    }

                    continue;
                }

                long cost = 0;

                while (a < b) {

                    if (a % 2 == 0) {
                        cost += Math.min(x, y);
                    } else {
                        cost += x;
                    }

                    a++;
                }

                System.out.println(cost);
            }
        }
}
