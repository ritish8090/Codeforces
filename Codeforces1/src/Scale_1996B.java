import java.util.*;
public class Scale_1996B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();

                String[] grid = new String[n];

                for (int i = 0; i < n; i++) {
                    grid[i] = sc.next();
                }

                int size = n / k;

                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print(grid[i * k].charAt(j * k));
                    }
                    System.out.println();
                }
            }
        }
}
