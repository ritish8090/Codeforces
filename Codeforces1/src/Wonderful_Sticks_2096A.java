import java.io.*;
import java.util.*;
public class Wonderful_Sticks_2096A {

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                String s = br.readLine();

                int cnt = 0;
                for (char c : s.toCharArray())
                    if (c == '<') cnt++;

                int[] ans = new int[n];
                ans[0] = cnt + 1;

                int low = cnt;
                int high = cnt + 2;

                for (int i = 0; i < n - 1; i++) {
                    if (s.charAt(i) == '<')
                        ans[i + 1] = low--;
                    else
                        ans[i + 1] = high++;
                }

                for (int x : ans) out.append(x).append(' ');
                out.append('\n');
            }

            System.out.print(out);
        }
}
