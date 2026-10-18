import java.util.*;
public class Ten_Words_of_Wisdom_1850B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int maxQuality = -1;
                int winner = -1;

                for (int i = 1; i <= n; i++) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();

                    if (a <= 10 && b > maxQuality) {
                        maxQuality = b;
                        winner = i;
                    }
                }

                System.out.println(winner);
            }

            sc.close();
        }
}
