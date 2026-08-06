import java.util.*;
public class Was_there_an_Array_2069A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] b = new int[n - 2];

                for (int i = 0; i < n - 2; i++)
                    b[i] = sc.nextInt();

                boolean ok = true;

                for (int i = 0; i + 2 < b.length; i++) {
                    if (b[i] == 1 && b[i + 1] == 0 && b[i + 2] == 1) {
                        ok = false;
                        break;
                    }
                }

                System.out.println(ok ? "YES" : "NO");
            }
        }

}
