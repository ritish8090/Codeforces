import java.util.*;
public class All_Lengths_Subtraction2143A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] p = new int[n + 2];
                for (int i = 1; i <= n; i++) p[i] = sc.nextInt();

                int sumPos = 0;
                for (int i = 1; i <= n + 1; i++) {
                    if (p[i] > p[i-1]) sumPos += p[i] - p[i-1];
                }
                System.out.println(sumPos == n ? "YES" : "NO");
            }
        }
}
