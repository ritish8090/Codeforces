import java.util.*;
public class Race_2112A {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int a = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();

                boolean ok = false;

                for (int b = 1; b <= 100; b++) {

                    if (b == a) {
                        continue;
                    }

                    if (Math.abs(b - x) < Math.abs(a - x) &&
                            Math.abs(b - y) < Math.abs(a - y)) {

                        ok = true;
                        break;
                    }
                }

                System.out.println(ok ? "YES" : "NO");
            }
        }
}
