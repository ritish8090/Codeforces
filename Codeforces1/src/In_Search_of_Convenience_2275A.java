import java.util.*;
public class In_Search_of_Convenience_2275A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int x0 = sc.nextInt();
                int y0 = sc.nextInt();
                int r = sc.nextInt();

                int x = 0, y = 0;

                for (int i = 0; i <= r; i++) {
                    for (int j = 0; j <= r; j++) {
                        if (i * i + j * j == r * r) {
                            x = x0 + i;
                            y = y0 + j;
                            break;
                        }
                    }
                    if (x != 0 || y != 0) {
                        break;
                    }
                }

                System.out.println(x + " " + y);
            }

            sc.close();
        }
}
