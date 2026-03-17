import java.util.*;
public class Beautiful_Average_2162A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int max = 0;

                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();
                    max = Math.max(max, x);
                }

                System.out.println(max);
            }

            sc.close();
        }
}
