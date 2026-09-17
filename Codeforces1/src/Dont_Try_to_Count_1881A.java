import java.util.*;
public class Dont_Try_to_Count_1881A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();

                String x = sc.next();
                String s = sc.next();

                int operations = 0;
                int answer = -1;

                while (x.length() < 2 * m + n) {
                    if (x.contains(s)) {
                        answer = operations;
                        break;
                    }

                    x += x;
                    operations++;
                }

                if (answer == -1 && x.contains(s)) {
                    answer = operations;
                }

                System.out.println(answer);
            }
        }
}
