import java.util.*;
public class Circle_of_Apple_Trees_2153A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                Set<Integer> set = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    set.add(sc.nextInt());
                }
                System.out.println(set.size());
            }
        }
}
