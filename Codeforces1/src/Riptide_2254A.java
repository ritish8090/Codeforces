import java.util.*;
public class Riptide_2254A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                int rounds = 0;

                while (a != b && b != c && a != c) {
                    int max = Math.max(a, Math.max(b, c));
                    int min = Math.min(a, Math.min(b, c));

                    if (a == max) a--;
                    else if (b == max) b--;
                    else c--;

                    if (a == min) a++;
                    else if (b == min) b++;
                    else c++;

                    rounds++;
                }

                System.out.println(rounds);
            }
        }
}
