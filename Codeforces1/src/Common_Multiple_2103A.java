import java.io.*;
import java.util.*;
public class Common_Multiple_2103A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());

                StringTokenizer st = new StringTokenizer(br.readLine());

                HashSet<Integer> set = new HashSet<>();

                for (int i = 0; i < n; i++) {
                    set.add(Integer.parseInt(st.nextToken()));
                }

                sb.append(set.size()).append('\n');
            }

            System.out.print(sb);
        }
}
