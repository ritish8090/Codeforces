import java.util.*;
public class Sequence_Game_2164A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int T = sc.nextInt();

            while (T-- > 0) {

                int n = sc.nextInt();
                long min = Long.MAX_VALUE;
                long max = Long.MIN_VALUE;

                for (int i = 0; i < n; i++) {
                    long val = sc.nextLong();
                    min = Math.min(min, val);
                    max = Math.max(max, val);
                }

                long x = sc.nextLong();

                if (x >= min && x <= max)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
}
