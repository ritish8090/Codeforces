import java.io.*;
import java.util.*;
public class Olympiad_Date_2091A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine());

                int[] cnt = new int[10];
                int ans = 0;

                for (int i = 1; i <= n; i++) {
                    int d = Integer.parseInt(st.nextToken());
                    cnt[d]++;

                    if (ans == 0 &&
                            cnt[0] >= 3 &&
                            cnt[1] >= 1 &&
                            cnt[2] >= 2 &&
                            cnt[3] >= 1 &&
                            cnt[5] >= 1) {
                        ans = i;
                    }
                }

                sb.append(ans).append('\n');
            }

            System.out.print(sb);
        }

}
