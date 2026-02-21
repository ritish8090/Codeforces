import java.util.*;

public class flipping_binary_string_b {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                List<Integer> ones = new ArrayList<>();
                List<Integer> zeros = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '1') {
                        ones.add(i + 1);
                    } else {
                        zeros.add(i + 1);
                    }
                }

                if (ones.size() % 2 == 0) {
                    // Case 1
                    System.out.println(ones.size());
                    for (int x : ones) {
                        System.out.print(x + " ");
                    }
                    System.out.println();
                } else if (zeros.size() % 2 == 1) {
                    // Case 2
                    System.out.println(zeros.size());
                    for (int x : zeros) {
                        System.out.print(x + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println(-1);
                }
            }
        }
}
