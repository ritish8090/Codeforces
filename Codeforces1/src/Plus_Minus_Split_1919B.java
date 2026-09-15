import java.util.*;
public class Plus_Minus_Split_1919B {

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                int plus = 0;
                int minus = 0;

                for (char c : s.toCharArray()) {
                    if (c == '+') {
                        plus++;
                    } else {
                        minus++;
                    }
                }

                System.out.println(Math.abs(plus - minus));
            }
        }
    }
}
