import java.util.*;
public class osu_mania_2009B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] ans = new int[n];

                for (int i = 0; i < n; i++) {
                    String s = sc.next();
                    for (int j = 0; j < 4; j++) {
                        if (s.charAt(j) == '#') {
                            ans[n - 1 - i] = j + 1;
                            break;
                        }
                    }
                }

                for (int x : ans) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
}
