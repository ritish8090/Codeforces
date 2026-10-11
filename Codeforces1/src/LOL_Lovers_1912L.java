import java.util.*;
public class LOL_Lovers_1912L {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            String s = sc.next();

            int totalL = 0;
            int totalO = 0;

            for (char ch : s.toCharArray()) {
                if (ch == 'L') totalL++;
                else totalO++;
            }

            int prefixL = 0;
            int prefixO = 0;

            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == 'L') prefixL++;
                else prefixO++;

                int suffixL = totalL - prefixL;
                int suffixO = totalO - prefixO;

                if (prefixL != suffixL && prefixO != suffixO) {
                    System.out.println(i + 1);
                    return;
                }
            }

            System.out.println(-1);
        }
}
