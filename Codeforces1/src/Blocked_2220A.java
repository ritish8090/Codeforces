import java.util.*;
import java.io.*;
public class Blocked_2220A {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                StringTokenizer st = new StringTokenizer(br.readLine());
                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
                Arrays.sort(a);

                boolean hasDup = false;
                Map<Integer,Integer> freq = new HashMap<>();
                for (int x : a) freq.merge(x, 1, Integer::sum);
                for (int v : freq.values()) if (v > 1) { hasDup = true; break; }

                if (hasDup) {
                    sb.append(-1).append('\n');
                } else {
                    // sort descending
                    Integer[] arr = new Integer[n];
                    for (int i = 0; i < n; i++) arr[i] = a[i];
                    Arrays.sort(arr, Collections.reverseOrder());
                    StringBuilder line = new StringBuilder();
                    for (int i = 0; i < n; i++) {
                        if (i > 0) line.append(' ');
                        line.append(arr[i]);
                    }
                    sb.append(line).append('\n');
                }
            }
            System.out.print(sb);
        }
}
