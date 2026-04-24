import java.util.*;
public class Passing_the_Ball_2204A {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = Integer.parseInt(scanner.nextLine().trim());

            while (t-- > 0) {
                int n = Integer.parseInt(scanner.nextLine().trim());
                String s = scanner.nextLine().trim();

                Set<Integer> received = new HashSet<>();
                int pos = 0;
                received.add(0);

                for (int i = 0; i < n; i++) {
                    if (s.charAt(pos) == 'R') pos++;
                    else pos--;
                    received.add(pos);
                }

                System.out.println(received.size());
            }
        }
}
