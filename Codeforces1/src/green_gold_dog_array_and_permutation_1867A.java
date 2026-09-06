import java.util.*;
public class green_gold_dog_array_and_permutation_1867A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                Integer[] idx = new Integer[n];

                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    idx[i] = i;
                }

                Arrays.sort(idx, (i, j) -> Integer.compare(a[i], a[j]));

                int[] b = new int[n];

                for (int i = 0; i < n; i++) {
                    b[idx[i]] = n - i;
                }

                for (int x : b) {
                    System.out.print(x + " ");
                }

                System.out.println();
            }
        }
}
