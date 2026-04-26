import java.util.*;
public class Maple_and_Multiplication_2139A {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = Integer.parseInt(scanner.nextLine().trim());

            while (t-- > 0) {
                String[] parts = scanner.nextLine().trim().split(" ");
                int a = Integer.parseInt(parts[0]);
                int b = Integer.parseInt(parts[1]);

                if (a == b) System.out.println(0);
                else if (a % b == 0 || b % a == 0) System.out.println(1);
                else System.out.println(2);
            }
        }
}
