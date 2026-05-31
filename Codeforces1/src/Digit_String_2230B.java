import java.io.*;
public class Digit_String_2230B {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                String s = br.readLine();
                int n = s.length();

                int[] pref2 = new int[n + 1];
                int[] suf13 = new int[n + 1];

                for (int i = 0; i < n; i++) {
                    pref2[i + 1] = pref2[i] + (s.charAt(i) == '2' ? 1 : 0);
                }

                for (int i = n - 1; i >= 0; i--) {
                    char c = s.charAt(i);
                    suf13[i] = suf13[i + 1] + ((c == '1' || c == '3') ? 1 : 0);
                }

                int keep = 0;

                for (int i = 0; i <= n; i++) {
                    keep = Math.max(keep, pref2[i] + suf13[i]);
                }

                out.append(n - keep).append('\n');
            }

            System.out.print(out);
        }
}
