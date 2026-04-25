import java.util.*;
public class Antimedian_Deletion_2211A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] p = new int[n];
                for (int i = 0; i < n; i++) p[i] = sc.nextInt();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    if (i > 0) sb.append(' ');
                    sb.append(n == 1 ? 1 : 2);
                }
                System.out.println(sb);
            }
        }
}
