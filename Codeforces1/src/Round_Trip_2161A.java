import java.util.*;
public class Round_Trip_2161A {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {

                long R0 = sc.nextLong();
                long X = sc.nextLong();
                long D = sc.nextLong();
                int n = sc.nextInt();

                String s = sc.next();

                long low = R0;
                long high = R0;

                int ans = 0;

                for (int i = 0; i < n; i++) {

                    if (s.charAt(i) == '1') {

                        ans++;
                        low = Math.max(0, low - D);
                        high = high + D;

                    } else {

                        if (low < X) {

                            ans++;
                            low = Math.max(0, low - D);
                            high = high + D;
                            high = Math.min(high, X - 1);

                            if (low > high) break;
                        }
                    }
                }

                System.out.println(ans);
            }

            sc.close();
        }
}
