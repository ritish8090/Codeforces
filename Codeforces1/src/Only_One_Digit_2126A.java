import java.util.*;
import java.io.*;
public class Only_One_Digit_2126A {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                String x = br.readLine().trim();
                char min = '9';
                for (char c : x.toCharArray()) if (c < min) min = c;
                sb.append(min - '0').append('\n');
            }

            System.out.print(sb);
        }
}
