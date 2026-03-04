import java.util.*;
public class little_fairys_painting_2175a {
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
                int ans = k;

                while (!set.contains(ans)) {
                    ans++;
                }

                System.out.println(ans);
            }

            sc.close();
        }

}
