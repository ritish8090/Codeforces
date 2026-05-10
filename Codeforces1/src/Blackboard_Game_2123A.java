import java.util.*;
import java.io.*;
public class Blackboard_Game_2123A {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                sb.append(n % 4 == 0 ? "Bob" : "Alice").append('\n');
            }
            System.out.print(sb);
        }
}
