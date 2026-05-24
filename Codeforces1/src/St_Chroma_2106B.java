import java.util.*;
import java.io.*;
public class St_Chroma_2106B {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());

                int[] p = new int[n];
                int idx = 0;

                if (x == 0) {
                    for (int i = 1; i < n; i++) p[idx++] = i;
                    p[idx] = 0;
                } else {
                    for (int i = 0; i < x && idx < n; i++) p[idx++] = i;
                    for (int i = x + 1; i < n; i++) p[idx++] = i;
                    if (x < n) p[idx] = x;
                }

                for (int i = 0; i < n; i++) {
                    sb.append(p[i]);
                    if (i < n - 1) sb.append(' ');
                }
                sb.append('\n');
            }

            System.out.print(sb);
        }
}
