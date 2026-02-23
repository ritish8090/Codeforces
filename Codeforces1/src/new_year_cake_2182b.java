
import java.util.*;
public class new_year_cake_2182b {
        static int simulate(long white, long dark, boolean startWhite) {
            int layers = 0;
            long size = 1;
            boolean isWhite = startWhite;

            while (true) {
                if (isWhite) {
                    if (white < size) break;
                    white -= size;
                } else {
                    if (dark < size) break;
                    dark -= size;
                }
                layers++;
                size *= 2;
                isWhite = !isWhite;
            }

            return layers;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();

                int option1 = simulate(a, b, true);
                int option2 = simulate(a, b, false);

                System.out.println(Math.max(option1, option2));
            }
        }
}
