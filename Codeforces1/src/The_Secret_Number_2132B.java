import java.util.*;
import java.io.*;
public class The_Secret_Number_2132B {
    public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                long n = Long.parseLong(br.readLine());

                List<Long> ans = new ArrayList<>();

                long pow10 = 10;

                while (pow10 <= 1_000_000_000_000_000_000L) {
                    long d = pow10 + 1;

                    if (n % d == 0) {
                        ans.add(n / d);
                    }

                    if (pow10 > Long.MAX_VALUE / 10) break;
                    pow10 *= 10;
                }

                Collections.sort(ans);

                if (ans.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    sb.append(ans.size()).append('\n');

                    for (long x : ans) {
                        sb.append(x).append(' ');
                    }

                    sb.append('\n');
                }
            }

            System.out.print(sb);
        }
}
