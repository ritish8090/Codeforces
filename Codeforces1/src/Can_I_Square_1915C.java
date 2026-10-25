import java.util.*;
public class Can_I_Square_1915C {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                long sum = 0;

                for (int i = 0; i < n; i++) {
                    sum += sc.nextLong();
                }

                long side = (long) Math.sqrt(sum);

                if (side * side == sum) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

            sc.close();
        }
}
