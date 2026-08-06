import java.util.*;
public class Shohag_Loves_Mod_2039A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];

                int last = 0;

                for (int i = 1; i <= n; i++) {
                    for (int x = last + 1; x <= 100; x++) {
                        boolean ok = true;

                        for (int j = 1; j < i; j++) {
                            if (a[j - 1] % j == x % i) {
                                ok = false;
                                break;
                            }
                        }

                        if (ok) {
                            a[i - 1] = x;
                            last = x;
                            break;
                        }
                    }
                }

                for (int x : a)
                    System.out.print(x + " ");
                System.out.println();
            }
        }
}
