import java.util.*;

public class reverse_a_permutation_2193b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }

            boolean done = false;

            for (int i = 0; i < n && !done; i++) {
                int expected = n - i;

                if (p[i] != expected) {
                    int pos = -1;
                    for (int j = i + 1; j < n; j++) {
                        if (p[j] == expected) {
                            pos = j;
                            break;
                        }
                    }

                    if (pos != -1) {
                        reverse(p, i, pos);
                    }
                    done = true;
                }
            }

            for (int x : p) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}
