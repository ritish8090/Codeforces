import java.util.*;
public class Rigged_1879A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                int s1 = sc.nextInt();
                int e1 = sc.nextInt();

                boolean possible = true;

                for (int i = 1; i < n; i++) {
                    int s = sc.nextInt();
                    int e = sc.nextInt();

                    if (s >= s1 && e >= e1) {
                        possible = false;
                    }
                }

                System.out.println(possible ? s1 : -1);
            }

            sc.close();
        }
}
