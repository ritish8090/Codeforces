import java.util.*;
public class Question_Marks_1993A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                int[] count = new int[4];

                for (char c : s.toCharArray()) {
                    if (c == 'A') count[0]++;
                    else if (c == 'B') count[1]++;
                    else if (c == 'C') count[2]++;
                    else if (c == 'D') count[3]++;
                }

                int ans = 0;

                for (int i = 0; i < 4; i++) {
                    ans += Math.min(count[i], n);
                }

                System.out.println(ans);
            }
        }
}
