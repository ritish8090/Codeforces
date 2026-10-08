import java.util.*;
public class Jagged_Swaps_1896A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int pos = -1;

                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();
                    if (x == 1) pos = i;
                }

                System.out.println(pos == 0 ? "YES" : "NO");
            }
        }
}
