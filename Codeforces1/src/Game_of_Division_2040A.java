import java.io.*;
import java.util.*;
public class Game_of_Division_2040A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());

                int[] a = new int[n];
                int[] rem = new int[n];
                int[] cnt = new int[k];

                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(st.nextToken());
                    rem[i] = a[i] % k;
                    cnt[rem[i]]++;
                }

                int ans = -1;
                for (int i = 0; i < n; i++) {
                    if (cnt[rem[i]] == 1) {
                        ans = i + 1;
                        break;
                    }
                }

                if (ans == -1) out.append("NO\n");
                else out.append("YES\n").append(ans).append('\n');
            }

            System.out.print(out);
        }
}
