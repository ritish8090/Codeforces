import java.io.*;
import java.util.*;
public class Binary_Matrix_2082A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());

                int[] col = new int[m];
                int oddRows = 0;

                for (int i = 0; i < n; i++) {
                    char[] s = br.readLine().toCharArray();
                    int row = 0;
                    for (int j = 0; j < m; j++) {
                        int x = s[j] - '0';
                        row ^= x;
                        col[j] ^= x;
                    }
                    oddRows += row;
                }

                int oddCols = 0;
                for (int x : col) oddCols += x;

                sb.append(Math.max(oddRows, oddCols)).append('\n');
            }

            System.out.print(sb);
        }
}
