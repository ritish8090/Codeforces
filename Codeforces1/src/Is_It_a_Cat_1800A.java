import java.util.*;
public class Is_It_a_Cat_1800A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next().toLowerCase();

                StringBuilder result = new StringBuilder();

                for (int i = 0; i < n; i++) {
                    char c = s.charAt(i);

                    if (result.length() == 0 || result.charAt(result.length() - 1) != c) {
                        result.append(c);
                    }
                }

                System.out.println(result.toString().equals("meow") ? "YES" : "NO");
            }

            sc.close();
        }

}
