import java.io.*;
import java.util.*;
public class MEX_Destruction_2049A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine());

                int groups = 0;
                boolean inGroup = false;

                for (int i = 0; i < n; i++) {
                    int x = Integer.parseInt(st.nextToken());

                    if (x != 0) {
                        if (!inGroup) {
                            groups++;
                            inGroup = true;
                        }
                    } else {
                        inGroup = false;
                    }
                }

                out.append(Math.min(groups, 2)).append('\n');
            }

            System.out.print(out);
        }
}
