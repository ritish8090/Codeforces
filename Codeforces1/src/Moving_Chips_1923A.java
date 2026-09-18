import java.util.*;
public class Moving_Chips_1923A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int first = 0;
                while (a[first] == 0) {
                    first++;
                }

                int last = n - 1;
                while (a[last] == 0) {
                    last--;
                }

                int ans = 0;

                for (int i = first; i <= last; i++) {
                    if (a[i] == 0) {
                        ans++;
                    }
                }

                System.out.println(ans);
            }
        }
}
