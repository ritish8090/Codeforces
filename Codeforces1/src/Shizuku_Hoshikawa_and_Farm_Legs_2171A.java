import java.util.*;
public class Shizuku_Hoshikawa_and_Farm_Legs_2171A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                if (n % 2 == 1) {
                    System.out.println(0);
                } else {
                    int k = n / 2;
                    System.out.println(k / 2 + 1);
                }
            }

            sc.close();
        }

}
