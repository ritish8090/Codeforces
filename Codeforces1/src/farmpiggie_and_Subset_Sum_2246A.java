import java.util.*;
public class farmpiggie_and_Subset_Sum_2246A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                for (int i = 1; i <= n; i += 2) {
                    System.out.print((i + 1) + " " + i + " ");
                }
                System.out.println();
            }
        }
}
