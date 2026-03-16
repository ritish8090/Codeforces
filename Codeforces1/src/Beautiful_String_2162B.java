import java.util.*;
public class Beautiful_String_2162B {
        static boolean nonDecreasing(String s) {
            for (int i = 1; i < s.length(); i++)
                if (s.charAt(i) < s.charAt(i - 1))
                    return false;
            return true;
        }

        static boolean palindrome(String s) {
            int l = 0, r = s.length() - 1;
            while (l < r)
                if (s.charAt(l++) != s.charAt(r--))
                    return false;
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();
                boolean found = false;

                for (int mask = 0; mask < (1 << n) && !found; mask++) {
                    StringBuilder p = new StringBuilder();
                    StringBuilder x = new StringBuilder();
                    List<Integer> idx = new ArrayList<>();

                    for (int i = 0; i < n; i++) {
                        if ((mask & (1 << i)) != 0) {
                            p.append(s.charAt(i));
                            idx.add(i + 1);
                        } else {
                            x.append(s.charAt(i));
                        }
                    }

                    if (nonDecreasing(p.toString()) && palindrome(x.toString())) {
                        System.out.println(idx.size());
                        if (idx.size() > 0) {
                            for (int v : idx) System.out.print(v + " ");
                            System.out.println();
                        } else System.out.println();
                        found = true;
                    }
                }

                if (!found) System.out.println(-1);
            }
        }
}
