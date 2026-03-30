import java.util.*;

public class Notelock_2154A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                String s = sc.next();

                int last = -1000000;
                int count = 0;

                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '1') {
                        if (i - last >= k) {
                            count++;
                        }
                        last = i;
                    }
                }

                System.out.println(count);
            }
        }
}
