import java.util.*;
import java.io.*;
public class Even_Modulo_Pair_2164B {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());

                st = new StringTokenizer(br.readLine());
                long[] a = new long[n];

                for (int i = 0; i < n; i++) {
                    a[i] = Long.parseLong(st.nextToken());
                }

                boolean found = false;

                for (int i = 0; i < n && !found; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if ((a[j] % a[i]) % 2 == 0) {
                            System.out.println(a[i] + " " + a[j]);
                            found = true;
                            break;
                        }
                    }
                }

                if (!found) {
                    System.out.println(-1);
                }
            }
        }
}
