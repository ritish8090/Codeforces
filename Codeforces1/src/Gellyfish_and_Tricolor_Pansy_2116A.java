import java.io.*;
import java.util.*;
public class Gellyfish_and_Tricolor_Pansy_2116A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());

            StringBuilder ans = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                long a = Long.parseLong(st.nextToken());
                long b = Long.parseLong(st.nextToken());
                long c = Long.parseLong(st.nextToken());
                long d = Long.parseLong(st.nextToken());

                if (Math.min(a, c) >= Math.min(b, d))
                    ans.append("Gellyfish\n");
                else
                    ans.append("Flower\n");
            }

            System.out.print(ans);
        }
}
