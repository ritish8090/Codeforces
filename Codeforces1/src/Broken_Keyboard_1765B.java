import java.util.*;
public class Broken_Keyboard_1765B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                int i = 0;
                int press = 1;
                boolean possible = true;

                while (i < n) {
                    if (press % 2 == 1) {
                        i++;
                    } else {
                        if (i + 1 >= n || s.charAt(i) != s.charAt(i + 1)) {
                            possible = false;
                            break;
                        }
                        i += 2;
                    }

                    press++;
                }

                System.out.println(possible ? "YES" : "NO");
            }

            sc.close();
        }
}
