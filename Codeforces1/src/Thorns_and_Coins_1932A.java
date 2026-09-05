import java.util.*;
public class Thorns_and_Coins_1932A{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                int coins = 0;
                int i = 0;

                while (i < n) {
                    if (s.charAt(i) == '@') {
                        coins++;
                    }

                    if (i + 1 < n && s.charAt(i + 1) != '*') {
                        i++;
                    } else if (i + 2 < n && s.charAt(i + 2) != '*') {
                        i += 2;
                    } else {
                        break;
                    }
                }

                System.out.println(coins);
            }
        }
}
