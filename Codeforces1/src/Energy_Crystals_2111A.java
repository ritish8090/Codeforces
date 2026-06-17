import java.io.*;
import java.util.*;
public class Energy_Crystals_2111A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                long x = Long.parseLong(br.readLine());

                int k = 63 - Long.numberOfLeadingZeros(x); // floor(log2(x))
                long ans = 2L * k + 3;

                sb.append(ans).append('\n');
            }

            System.out.print(sb);
        }
}
