import java.util.*;
public class Parity_Sort_1851B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int[] b = a.clone();
                Arrays.sort(b);

                boolean possible = true;

                for (int i = 0; i < n; i++) {
                    if (a[i] % 2 != b[i] % 2) {
                        possible = false;
                        break;
                    }
                }

                System.out.println(possible ? "YES" : "NO");
            }

            sc.close();
        }
}
