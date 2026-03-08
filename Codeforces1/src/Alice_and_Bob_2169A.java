import java.util.*;
public class Alice_and_Bob_2169A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                long a = sc.nextLong();

                int less = 0, greater = 0;

                for (int i = 0; i < n; i++) {
                    long v = sc.nextLong();
                    if (v < a) less++;
                    else if (v > a) greater++;
                }

                if (greater >= less) {
                    System.out.println(a + 1);
                } else {
                    System.out.println(Math.max(0, a - 1));
                }
            }

            sc.close();
        }
}
