import java.util.*;
public class Turn_Into_a_Palindrome_2267A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                char c = sc.next().charAt(0);
                String s = sc.next();

                int ans = 0;

                for (int i = 0; i < n / 2; i++) {
                    char left = s.charAt(i);
                    char right = s.charAt(n - i - 1);

                    if (left == right) {
                        continue;
                    }

                    if (left == c || right == c) {
                        ans += 1;
                    } else {
                        ans += 2;
                    }
                }

                System.out.println(ans);
            }

            sc.close();
        }
}
