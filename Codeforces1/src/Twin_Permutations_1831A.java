import java.util.*;
public class Twin_Permutations_1831A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                for (int i = 0; i < n; i++) {
                    int a = sc.nextInt();
                    int b = n + 1 - a;
                    System.out.print(b + " ");
                }
                System.out.println();
            }
            sc.close();
        }
}
