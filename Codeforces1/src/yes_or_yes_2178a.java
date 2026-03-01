import java.util.*;
public class yes_or_yes_2178a {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                String s = sc.next();
                int yCount = 0;

                for (char c : s.toCharArray()) {
                    if (c == 'Y') yCount++;
                }

                if (yCount <= 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
}
