import java.util.*;
public class Tub_Tube_Feed_1822A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int q = sc.nextInt();

            while (q-- > 0) {
                int n = sc.nextInt();
                int t = sc.nextInt();

                int[] a = new int[n];
                int[] b = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                for (int i = 0; i < n; i++) {
                    b[i] = sc.nextInt();
                }

                int max = -1;
                int ans = -1;

                for (int i = 0; i < n; i++) {
                    int time = a[i] + i;

                    if (time <= t && b[i] > max) {
                        max = b[i];
                        ans = i + 1;
                    }
                }

                System.out.println(ans);
            }

            sc.close();
        }
}
