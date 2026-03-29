import java.util.*;
public class Increase_or_Smash_2152A {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();

                HashSet<Integer> set = new HashSet<>();

                for (int i = 0; i < n; i++) {
                    set.add(sc.nextInt());
                }

                int k = set.size();
                int ans = 2 * k - 1;

                System.out.println(ans);
            }

            sc.close();
        }
}
