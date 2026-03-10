import java.util.*;
public class Isamatdin_and_His_Magic_Wand_2167C {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                long[] a = new long[n];

                boolean hasEven = false, hasOdd = false;

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                    if (a[i] % 2 == 0) hasEven = true;
                    else hasOdd = true;
                }

                if (hasEven && hasOdd) {
                    Arrays.sort(a);
                }

                for (long x : a) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }

            sc.close();
        }
}
