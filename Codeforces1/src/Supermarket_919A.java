import java.util.*;
public class Supermarket_919A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int m = sc.nextInt();

            double minPrice = Double.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                minPrice = Math.min(minPrice, (double) a / b);
            }

            System.out.printf("%.10f%n", minPrice * m);

            sc.close();
        }
}
