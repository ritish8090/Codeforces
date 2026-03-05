import java.util.*;
public class sleeping_through_classes_2173a {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                String s = sc.next();

                boolean[] awake = new boolean[n];

                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '1') {
                        for (int j = i; j <= Math.min(n - 1, i + k); j++) {
                            awake[j] = true;
                        }
                    }
                }

                int awakeCount = 0;
                for (boolean a : awake) {
                    if (a) awakeCount++;
                }

                System.out.println(n - awakeCount);
            }

            sc.close();
        }

}
