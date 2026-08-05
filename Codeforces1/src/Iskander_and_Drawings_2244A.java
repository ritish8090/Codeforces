import java.util.*;
public class Iskander_and_Drawings_2244A {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                int max = 0, cnt = 0;

                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '#') {
                        cnt++;
                    } else {
                        max = Math.max(max, cnt);
                        cnt = 0;
                    }
                }

                max = Math.max(max, cnt);

                System.out.println((max + 1) / 2);
            }
        }
}
