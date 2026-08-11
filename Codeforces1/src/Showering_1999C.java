import java.util.*;
public class Showering_1999C {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                long s = sc.nextLong();
                long m = sc.nextLong();

                long prev = 0;
                boolean possible = false;

                for (int i = 0; i < n; i++) {
                    long l = sc.nextLong();
                    long r = sc.nextLong();

                    if (l - prev >= s) {
                        possible = true;
                    }

                    prev = r;
                }

                if (m - prev >= s) {
                    possible = true;
                }

                System.out.println(possible ? "YES" : "NO");
            }
        }
}
