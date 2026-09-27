import java.util.*;
public class XY_Sequence_1657B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                long B = sc.nextLong();
                long x = sc.nextLong();
                long y = sc.nextLong();

                long cur = 0;
                long ans = 0;

                for (int i = 0; i < n; i++) {
                    if (cur + x <= B) {
                        cur += x;
                    } else {
                        cur -= y;
                    }

                    ans += cur;
                }

                System.out.println(ans);
            }

            sc.close();
        }
}
