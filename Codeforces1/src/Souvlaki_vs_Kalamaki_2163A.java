package SouvlakiVS;
import java.util.*;
public class Souvlaki_vs_Kalamaki_2163A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            boolean ok = true;

            for (int i = 1; i < n - 1; i += 2) {
                if (a[i] < a[i + 1]) {
                    ok = false;
                    break;
                }
            }

            if (ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
