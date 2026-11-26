import java.util.*;
public class Matrix_Rotation_1772B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();

                boolean possible = false;

                for (int i = 0; i < 4; i++) {
                    if (a < b && c < d && a < c && b < d) {
                        possible = true;
                        break;
                    }

                    int temp = a;
                    a = c;
                    c = d;
                    d = b;
                    b = temp;
                }

                System.out.println(possible ? "YES" : "NO");
            }

            sc.close();
        }
}
