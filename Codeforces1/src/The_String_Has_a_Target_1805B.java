import java.util.*;
public class The_String_Has_a_Target_1805B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                char minChar = 'z';
                int idx = -1;

                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) <= minChar) {
                        minChar = s.charAt(i);
                        idx = i;
                    }
                }

                String ans = s.charAt(idx) + s.substring(0, idx) + s.substring(idx + 1);

                System.out.println(ans);
            }

            sc.close();
        }

}
