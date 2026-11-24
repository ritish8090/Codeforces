import java.util.*;
public class Unrequited_Love_2275C {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int[] triad = new int[n - 4];
                HashMap<Integer, Integer> map = new HashMap<>();
                long ans = 0;

                for (int i = 0; i < n - 4; i++) {
                    triad[i] = a[i] + a[i + 2] - a[i + 4];

                    ans += map.getOrDefault(triad[i], 0);

                    if (i >= 2 && triad[i] == triad[i - 2]) {
                        ans--;
                    }

                    if (i >= 4 && triad[i] == triad[i - 4]) {
                        ans--;
                    }

                    map.put(triad[i], map.getOrDefault(triad[i], 0) + 1);
                }

                System.out.println(ans);
            }

            sc.close();
        }
}
