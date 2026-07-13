import java.io.*;
import java.util.*;
public class Trippi_Troppi_2094A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                sb.append(st.nextToken().charAt(0));
                sb.append(st.nextToken().charAt(0));
                sb.append(st.nextToken().charAt(0));
                sb.append('\n');
            }

            System.out.print(sb);
        }
}
