import java.util.*;
public class Increasing_Sequence_1882A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                long prev = 0;

                for (int i = 0; i < n; i++) {
                    long a = sc.nextLong();

                    long cur = prev + 1;

                    if (cur == a) {
                        cur++;
                    }

                    prev = cur;
                }

                System.out.println(prev);
            }

            sc.close();
        }
}
