import java.util.*;
import java.io.*;
public class Mix_Mex_Max_2127A {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                StringTokenizer st = new StringTokenizer(br.readLine());
                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

                boolean possible = true;

                boolean changed = true;
                while (changed) {
                    changed = false;
                    for (int i = 0; i <= n - 3; i++) {
                        int fixed = -1;
                        boolean conflict = false;
                        for (int k = i; k < i + 3; k++) {
                            if (a[k] != -1) {
                                if (a[k] == 0) { conflict = true; break; }
                                if (fixed == -1) fixed = a[k];
                                else if (fixed != a[k]) { conflict = true; break; }
                            }
                        }
                        if (conflict) { possible = false; break; }
                        if (fixed != -1) {
                            for (int k = i; k < i + 3; k++) {
                                if (a[k] == -1) { a[k] = fixed; changed = true; }
                            }
                        }
                    }
                    if (!possible) break;
                }

                if (possible) {
                    for (int i = 0; i <= n - 3; i++) {
                        int fixed = -1;
                        boolean conflict = false;
                        for (int k = i; k < i + 3; k++) {
                            if (a[k] != -1) {
                                if (a[k] == 0) { conflict = true; break; }
                                if (fixed == -1) fixed = a[k];
                                else if (fixed != a[k]) { conflict = true; break; }
                            }
                        }
                        if (conflict) { possible = false; break; }
                    }
                }

                sb.append(possible ? "YES" : "NO").append('\n');
            }

            System.out.print(sb);
        }
}
