import java.util.*;
public class Eraser_1873D {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                String s = sc.next();

                int ans = 0;
                int i = 0;

                while (i < n) {
                    if (s.charAt(i) == 'B') {
                        ans++;
                        i += k;
                    } else {
                        i++;
                    }
                }

                System.out.println(ans);
            }

            sc.close();
        }
}
