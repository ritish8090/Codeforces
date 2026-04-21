import java.util.*;
import java.io.*;
public class Simply_Sitting_on_Chairs_2210B {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                StringTokenizer st = new StringTokenizer(br.readLine());
                int count = 0;
                for (int i = 1; i <= n; i++) {
                    int pi = Integer.parseInt(st.nextToken());
                    if (pi <= i) count++;
                }
                sb.append(count).append('\n');
            }
            System.out.print(sb);
        }
}
