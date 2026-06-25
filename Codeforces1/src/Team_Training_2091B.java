import java.io.*;
import java.util.*;

public class Team_Training_2091B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            Integer[] a = new Integer[n];
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(a, Collections.reverseOrder());

            int teams = 0;
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                cnt++;

                if ((long) cnt * a[i] >= x) {
                    teams++;
                    cnt = 0;
                }
            }

            sb.append(teams).append('\n');
        }
        System.out.print(sb);
    }
}
