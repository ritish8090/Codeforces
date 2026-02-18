
import java.util.*;
public class table_with_numbers_2189a {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int h = sc.nextInt();
                int l = sc.nextInt();

                int R = 0, C = 0, B = 0;
                int limit = Math.min(h, l);

                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();
                    if (x <= h) R++;
                    if (x <= l) C++;
                    if (x <= limit) B++;
                }

                int answer = Math.min(
                        Math.min(R, C),
                        (R + C - B) / 2
                );

                System.out.println(answer);
            }
        }
}
