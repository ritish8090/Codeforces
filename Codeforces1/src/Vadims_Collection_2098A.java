import java.io.*;
public class Vadims_Collection_2098A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder out = new StringBuilder();

            while (t-- > 0) {
                String s = br.readLine();

                int[] freq = new int[10];
                for (char c : s.toCharArray()) {
                    freq[c - '0']++;
                }

                StringBuilder ans = new StringBuilder();

                for (int i = 0; i < 10; i++) {
                    int need = 9 - i;
                    for (int d = need; d <= 9; d++) {
                        if (freq[d] > 0) {
                            ans.append((char) ('0' + d));
                            freq[d]--;
                            break;
                        }
                    }
                }

                out.append(ans).append('\n');
            }

            System.out.print(out);
        }
}
