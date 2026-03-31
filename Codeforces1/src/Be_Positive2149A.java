import java.util.*;

public class Be_Positive2149A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                int neg = 0, zero = 0;

                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();
                    if (x == -1) neg++;
                    else if (x == 0) zero++;
                }

                int operations = zero;

                if (neg % 2 != 0) {
                    operations += 2;
                }

                System.out.println(operations);
            }
        }
}
