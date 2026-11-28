import java.util.*;
public class Line_to_Cashier_408A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] k = new int[n];

            for (int i = 0; i < n; i++) {
                k[i] = sc.nextInt();
            }

            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int time = 0;

                for (int j = 0; j < k[i]; j++) {
                    int m = sc.nextInt();
                    time += m * 5 + 15;
                }

                ans = Math.min(ans, time);
            }

            System.out.println(ans);
            sc.close();
        }
}
