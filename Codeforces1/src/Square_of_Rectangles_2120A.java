import java.util.*;
public class Square_of_Rectangles_2120A {
        static boolean canFormSquare(int l1, int b1,
                                     int l2, int b2,
                                     int l3, int b3) {

            int area = l1 * b1 + l2 * b2 + l3 * b3;

            int s = (int) Math.sqrt(area);

            if (s * s != area)
                return false;

            if (l1 == s && l2 == s && l3 == s &&
                    b1 + b2 + b3 == s)
                return true;

            if (b1 == s && b2 == s && b3 == s &&
                    l1 + l2 + l3 == s)
                return true;

            if (l1 == s) {
                int rem = s - b1;

                if (rem > 0 &&
                        b2 == rem &&
                        b3 == rem &&
                        l2 + l3 == s)
                    return true;
            }

            if (b1 == s) {
                int rem = s - l1;

                if (rem > 0 &&
                        l2 == rem &&
                        l3 == rem &&
                        b2 + b3 == s)
                    return true;
            }

            return false;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int l1 = sc.nextInt();
                int b1 = sc.nextInt();

                int l2 = sc.nextInt();
                int b2 = sc.nextInt();

                int l3 = sc.nextInt();
                int b3 = sc.nextInt();

                if (canFormSquare(l1, b1, l2, b2, l3, b3))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
}
