import java.util.*;
public class Good_Contest_2266A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                int all3 = Math.min(a, Math.min(b, c));
                System.out.println(n - all3);
            }

            sc.close();
        }
}
