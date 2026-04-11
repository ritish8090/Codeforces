import java.util.*;

public class Cut_the_Array2144A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = sc.nextInt();

                int[] pref = new int[n];
                pref[0] = a[0] % 3;
                for (int i = 1; i < n; i++) {
                    pref[i] = (pref[i - 1] + a[i]) % 3;
                }

                boolean found = false;

                for (int l = 0; l < n - 2 && !found; l++) {
                    for (int r = l + 1; r < n - 1 && !found; r++) {
                        int s1 = pref[l];
                        int s2 = (pref[r] - pref[l] + 3) % 3;
                        int s3 = (pref[n - 1] - pref[r] + 3) % 3;

                        if ((s1 == s2 && s2 == s3) ||
                                (s1 != s2 && s2 != s3 && s1 != s3)) {
                            System.out.println((l + 1) + " " + (r + 1));
                            found = true;
                        }
                    }
                }

                if (!found) System.out.println("0 0");
            }
        }
}
