import java.util.*;
import java.io.*;
public class Maximum_Cost_Permutation_2144B {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                int[] p = new int[n];
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) p[i] = Integer.parseInt(st.nextToken());

                boolean[] present = new boolean[n + 1];
                List<Integer> zeros = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    if (p[i] != 0) present[p[i]] = true;
                    else zeros.add(i);
                }
                List<Integer> avail = new ArrayList<>();
                for (int v = 1; v <= n; v++)
                    if (!present[v]) avail.add(v);

                if (zeros.isEmpty()) {
                    // compute cost directly
                    int l = -1, r = -1;
                    for (int i = 0; i < n; i++) {
                        if (p[i] != i + 1) {
                            if (l == -1) l = i;
                            r = i;
                        }
                    }
                    sb.append(l == -1 ? 0 : r - l + 1).append('\n');
                    continue;
                }

                int firstZeroIdx = zeros.get(0);
                int lastZeroIdx = zeros.get(zeros.size() - 1);

                int largest = avail.get(avail.size() - 1);
                int smallest = avail.get(0);

                int[] assigned = new int[zeros.size()];
                if (zeros.size() == 1) {
                    assigned[0] = avail.get(0);
                } else {
                    assigned[0] = largest;
                    assigned[zeros.size() - 1] = smallest;

                    int ai = 1;
                    for (int zi = 1; zi < zeros.size() - 1; zi++) {
                        assigned[zi] = avail.get(ai++);
                    }
                }

                for (int zi = 0; zi < zeros.size(); zi++)
                    p[zeros.get(zi)] = assigned[zi];

                int l = -1, r = -1;
                for (int i = 0; i < n; i++) {
                    if (p[i] != i + 1) {
                        if (l == -1) l = i;
                        r = i;
                    }
                }
                sb.append(l == -1 ? 0 : r - l + 1).append('\n');
            }

            System.out.print(sb);
        }
}
