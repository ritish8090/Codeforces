import java.io.*;
import java.util.*;
public class Snowfall_2227C {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());

                ArrayList<Integer> only2 = new ArrayList<>();
                ArrayList<Integer> neither = new ArrayList<>();
                ArrayList<Integer> only3 = new ArrayList<>();
                ArrayList<Integer> both = new ArrayList<>();

                StringTokenizer st = new StringTokenizer(br.readLine());

                for (int i = 0; i < n; i++) {
                    int x = Integer.parseInt(st.nextToken());

                    boolean d2 = (x % 2 == 0);
                    boolean d3 = (x % 3 == 0);

                    if (d2 && d3) both.add(x);
                    else if (d2) only2.add(x);
                    else if (d3) only3.add(x);
                    else neither.add(x);
                }

                for (int x : only2) out.append(x).append(' ');
                for (int x : neither) out.append(x).append(' ');
                for (int x : only3) out.append(x).append(' ');
                for (int x : both) out.append(x).append(' ');

                out.append('\n');
            }

            System.out.print(out);
        }
}
