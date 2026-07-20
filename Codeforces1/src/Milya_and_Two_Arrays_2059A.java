import java.io.*;
import java.util.*;
public class Milya_and_Two_Arrays_2059A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());

                HashSet<Integer> sa = new HashSet<>();
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) sa.add(Integer.parseInt(st.nextToken()));

                HashSet<Integer> sbb = new HashSet<>();
                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) sbb.add(Integer.parseInt(st.nextToken()));

                sb.append(sa.size() + sbb.size() >= 4 ? "YES\n" : "NO\n");
            }

            System.out.print(sb);
        }
}
