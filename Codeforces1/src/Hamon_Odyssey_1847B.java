import java.util.*;
public class Hamon_Odyssey_1847B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int curr = -1;
                int ans = 0;

                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();
                    curr &= x;

                    if (curr == 0) {
                        ans++;
                        curr = -1;
                    }
                }

                System.out.println(Math.max(1, ans));
            }

            sc.close();
        }
}
