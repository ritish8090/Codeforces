import java.io.*;
import java.util.*;
public class MEX_rose_2149C {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int n = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());

                int[] freq = new int[n + 1];

                st = new StringTokenizer(br.readLine());

                for (int i = 0; i < n; i++) {
                    int x = Integer.parseInt(st.nextToken());
                    freq[x]++;
                }

                int missing = 0;

                for (int i = 0; i < k; i++) {
                    if (freq[i] == 0) {
                        missing++;
                    }
                }

                int removeK = freq[k];

                sb.append(Math.max(missing, removeK)).append("\n");
            }

            System.out.print(sb);
        }
}
