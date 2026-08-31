import java.util.*;
public class Short_Sort_1873A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                String s = sc.next();

                int diff = 0;

                for (int i = 0; i < 3; i++) {
                    if (s.charAt(i) != "abc".charAt(i)) {
                        diff++;
                    }
                }

                System.out.println(diff <= 2 ? "YES" : "NO");
            }
        }
}
