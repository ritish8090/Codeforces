import java.io.*;
import java.util.*;
public class False_Alarm_2117A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());

            StringBuilder ans = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());

                st = new StringTokenizer(br.readLine());

                int first = -1, last = -1;

                for (int i = 0; i < n; i++) {
                    int v = Integer.parseInt(st.nextToken());

                    if (v == 1) {
                        if (first == -1) first = i;
                        last = i;
                    }
                }

                if (last - first + 1 <= x) {
                    ans.append("YES\n");
                } else {
                    ans.append("NO\n");
                }
            }

            System.out.print(ans);
        }
}
