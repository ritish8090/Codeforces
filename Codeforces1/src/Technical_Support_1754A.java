import java.util.*;
public class Technical_Support_1754A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                int answers = 0;
                boolean possible = true;

                for (int i = n - 1; i >= 0; i--) {
                    if (s.charAt(i) == 'A') {
                        answers++;
                    } else {
                        if (answers == 0) {
                            possible = false;
                            break;
                        }
                        answers--;
                    }
                }

                System.out.println(possible ? "Yes" : "No");
            }

            sc.close();
        }
}
