import java.util.*;
public class Bazoka_and_Mocha_Array_1975A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int count = 0;

                for (int i = 0; i < n; i++) {
                    if (a[i] > a[(i + 1) % n]) {
                        count++;
                    }
                }

                System.out.println(count <= 1 ? "Yes" : "No");
            }

            sc.close();
        }
}
