import java.util.*;
public class Cipher_Shifer_1840A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                StringBuilder ans = new StringBuilder();

                for (int i = 0; i < n; i++) {
                    char c = s.charAt(i);
                    ans.append(c);

                    int j = i + 1;

                    while (j < n && s.charAt(j) != c) {
                        j++;
                    }

                    i = j;
                }

                System.out.println(ans);
            }

            sc.close();
        }
}
