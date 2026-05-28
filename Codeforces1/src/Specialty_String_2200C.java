import java.io.*;
import java.util.*;

public class Specialty_String_2200C {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                String s = br.readLine();

                ArrayDeque<Character> stack = new ArrayDeque<>();

                for (char c : s.toCharArray()) {
                    if (!stack.isEmpty() && stack.peek() == c) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }

                sb.append(stack.isEmpty() ? "YES" : "NO").append("\n");
            }

            System.out.print(sb);
        }

}
