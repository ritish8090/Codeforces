import java.util.*;
public class Symmetric_Encoding_1974B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String b = sc.next();

                TreeSet<Character> set = new TreeSet<>();

                for (int i = 0; i < n; i++) {
                    set.add(b.charAt(i));
                }

                List<Character> r = new ArrayList<>(set);
                Map<Character, Character> map = new HashMap<>();

                int left = 0;
                int right = r.size() - 1;

                while (left <= right) {
                    map.put(r.get(left), r.get(right));
                    map.put(r.get(right), r.get(left));
                    left++;
                    right--;
                }

                StringBuilder ans = new StringBuilder();

                for (int i = 0; i < n; i++) {
                    ans.append(map.get(b.charAt(i)));
                }

                System.out.println(ans);
            }

            sc.close();
        }
}
