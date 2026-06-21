import java.io.*;
import java.util.*;
public class Disturbing_Distribution_2226A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            StringBuilder out = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine());

                int[] a = new int[n];
                long sumNonOne = 0;
                int lastNonOne = -1;

                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(st.nextToken());
                    if (a[i] > 1) {
                        sumNonOne += a[i];
                        lastNonOne = i;
                    }
                }

                long ans;

                if (lastNonOne == -1) {
                    ans = 1; // all elements are 1
                } else {
                    ans = sumNonOne;

                    boolean suffixOne = false;
                    for (int i = lastNonOne + 1; i < n; i++) {
                        if (a[i] == 1) {
                            suffixOne = true;
                            break;
                        }
                    }

                    if (suffixOne) ans++;
                }

                out.append(ans).append('\n');
            }

            System.out.print(out);
        }
}
