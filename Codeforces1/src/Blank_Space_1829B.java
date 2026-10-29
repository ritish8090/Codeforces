import java.util.*;
public class Blank_Space_1829B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int count = 0;
                int maxCount = 0;

                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();

                    if (x == 0) {
                        count++;
                        maxCount = Math.max(maxCount, count);
                    } else {
                        count = 0;
                    }
                }

                System.out.println(maxCount);
            }

            sc.close();
        }
}
