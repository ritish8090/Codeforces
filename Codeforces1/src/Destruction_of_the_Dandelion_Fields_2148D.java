import java.util.*;
import java.io.*;
public class Destruction_of_the_Dandelion_Fields_2148D {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                StringTokenizer st = new StringTokenizer(br.readLine());

                List<Long> odds = new ArrayList<>();
                long evenSum = 0;

                for (int i = 0; i < n; i++) {
                    long a = Long.parseLong(st.nextToken());
                    if (a % 2 == 1) odds.add(a);
                    else evenSum += a;
                }

                int k = odds.size();
                if (k == 0) {
                    sb.append(0).append("\n");
                    continue;
                }

                odds.sort(Collections.reverseOrder());

                long ans = evenSum;
                int take = (k + 1) / 2;
                for (int i = 0; i < take; i++) ans += odds.get(i);

                sb.append(ans).append("\n");
            }

            System.out.print(sb);
        }

}
