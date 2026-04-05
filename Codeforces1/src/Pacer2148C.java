import java.util.*;
import java.io.*;

public class Pacer2148C {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                long m = Long.parseLong(st.nextToken());

                long total = 0;
                boolean feasible = true;
                long prevTime = 0, prevSide = 0;

                for (int i = 0; i < n; i++) {
                    st = new StringTokenizer(br.readLine());
                    long a = Long.parseLong(st.nextToken());
                    long b = Long.parseLong(st.nextToken());

                    long gap = a - prevTime;
                    long need = prevSide ^ b;

                    if (gap < need) {
                        feasible = false;

                        for (int j = i + 1; j < n; j++) br.readLine();
                        break;
                    }


                    total += (gap % 2 == need % 2) ? gap : gap - 1;
                    prevTime = a;
                    prevSide = b;
                }

                if (feasible) {

                    total += (m - prevTime);
                }

                sb.append(feasible ? total : -1).append('\n');
            }

            System.out.print(sb);
        }
}
