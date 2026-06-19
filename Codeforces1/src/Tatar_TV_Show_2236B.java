import java.io.*;
import java.util.*;
public class Tatar_TV_Show_2236B {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            StringBuilder ans = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());

                String s = br.readLine().trim();

                boolean ok = true;

                for (int r = 0; r < k; r++) {
                    int parity = 0;
                    for (int i = r; i < n; i += k) {
                        parity ^= (s.charAt(i) - '0');
                    }
                    if (parity != 0) {
                        ok = false;
                        break;
                    }
                }

                ans.append(ok ? "YES" : "NO").append('\n');
            }

            System.out.print(ans);
        }
}
