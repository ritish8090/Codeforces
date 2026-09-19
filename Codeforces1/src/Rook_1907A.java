import java.util.*;
public class Rook_1907A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                String s = sc.next();

                char col = s.charAt(0);
                char row = s.charAt(1);

                for (char c = 'a'; c <= 'h'; c++) {
                    if (c != col) {
                        System.out.println(c + "" + row);
                    }
                }

                for (char r = '1'; r <= '8'; r++) {
                    if (r != row) {
                        System.out.println(col + "" + r);
                    }
                }
            }
        }
}
