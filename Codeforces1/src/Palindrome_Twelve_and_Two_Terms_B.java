import java.util.*;
import java.io.*;
public class Palindrome_Twelve_and_Two_Terms_B {
        static boolean isPalin(long x){
            String s = Long.toString(x);
            int l = 0, r = s.length() - 1;
            while (l < r) {
                if (s.charAt(l) != s.charAt(r)) return false;
                l++; r--;
            }
            return true;
        }
        public static void main(String[]  args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            List<Long> palins = new ArrayList<>();
            for (long i = 0; i <= 999; i++) {
                if (isPalin(i)) palins.add(i);
            }
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                long n = Long.parseLong(br.readLine().trim());
                long ans = -1;

                for (long a : palins) {
                    if (a > n) break;
                    if ((n - a) % 12 == 0) {
                        ans = a;
                        break;
                    }
                }

                if (ans == -1) sb.append(-1);
                else sb.append(ans).append(' ').append(n - ans);
                sb.append('\n');
            }

            System.out.print(sb);
        }
}
