import java.util.*;

public class string_rotation_game_a {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                int cnt = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) != s.charAt((i + 1) % n)) {
                        cnt++;
                    }
                }

                if (cnt == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(Math.min(n, cnt + 1));
                }
            }
        }
}
