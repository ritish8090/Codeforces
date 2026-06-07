import java.util.*;
import java.io.*;
public class Euclid_Sequence_and_Two_Numbers_A {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-->0){
                int n =Integer.parseInt(br.readLine().trim());
                StringTokenizer st = new StringTokenizer(br.readLine());

                int[] b = new int[n];
                for (int i = 0; i < n; i++) b[i] = Integer.parseInt(st.nextToken());

                Arrays.sort(b);
                for (int i = 0, j = n - 1; i < j; i++, j--) {
                    int tmp = b[i]; b[i] = b[j]; b[j] = tmp;
                }
                boolean valid =true;
                for(int i =0 ; i<=n-3; i++){
                    if (b[i] % b[i + 1] != b[i + 2]) {
                        valid = false;
                        break;
                    }
                }
                if (valid) sb.append(b[0]).append(' ').append(b[1]);
                else sb.append(-1);
                sb.append('\n');
            }
            System.out.print(sb);
        }
}
