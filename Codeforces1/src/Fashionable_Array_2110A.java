import java.io.*;
import java.util.*;
public class Fashionable_Array_2110A {
        public static void main(String[] args) throws Exception {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {

                int n = Integer.parseInt(br.readLine());

                int[] a = new int[n];

                StringTokenizer st = new StringTokenizer(br.readLine());

                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(st.nextToken());
                }

                Arrays.sort(a);

                int ans = n;

                int evenStart = -1, evenEnd = -1;
                int oddStart = -1, oddEnd = -1;

                for (int i = 0; i < n; i++) {

                    if (a[i] % 2 == 0) {
                        if (evenStart == -1) evenStart = i;
                        evenEnd = i;
                    } else {
                        if (oddStart == -1) oddStart = i;
                        oddEnd = i;
                    }
                }

                if (evenStart != -1) {
                    ans = Math.min(ans, evenStart + (n - 1 - evenEnd));
                }

                if (oddStart != -1) {
                    ans = Math.min(ans, oddStart + (n - 1 - oddEnd));
                }

                sb.append(ans).append("\n");
            }

            System.out.print(sb);
        }
}
