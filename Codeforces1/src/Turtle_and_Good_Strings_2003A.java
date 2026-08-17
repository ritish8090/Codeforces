import java.util.*;
public class Turtle_and_Good_Strings_2003A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                if (s.charAt(0) != s.charAt(n - 1)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
}
