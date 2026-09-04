import java.util.*;
public class Maximise_The_Score_1930A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[2 * n];

                for (int i = 0; i < 2 * n; i++) {
                    a[i] = sc.nextInt();
                }

                Arrays.sort(a);

                long score = 0;

                for (int i = 0; i < 2 * n; i += 2) {
                    score += a[i];
                }

                System.out.println(score);
            }
        }
}
