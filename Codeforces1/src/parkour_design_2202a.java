import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class parkour_design_2202a {

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                long x = Long.parseLong(st.nextToken());
                long y = Long.parseLong(st.nextToken());

                long D = x - 2 * y;

                boolean ok = true;

                if (D < 0 || D % 3 != 0) {
                    ok = false;
                } else {
                    long left = Math.max(0, -y);   // c ≥ -y and ≥ 0
                    long right = D / 6;             // c ≤ D/6

                    if (left > right) ok = false;
                }

                out.append(ok ? "YES\n" : "NO\n");
            }

            System.out.print(out.toString());
        }
}
