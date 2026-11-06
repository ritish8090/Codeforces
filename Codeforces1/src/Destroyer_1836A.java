import java.util.*;
public class Destroyer_1836A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                Arrays.sort(a);

                boolean valid = a[0] == 0;
                int prevCount = 0;
                int currCount = 0;
                int prevValue = -1;

                for (int i = 0; i < n && valid;) {
                    int value = a[i];
                    currCount = 0;

                    while (i < n && a[i] == value) {
                        currCount++;
                        i++;
                    }

                    if (value > 0) {
                        if (value != prevValue + 1 || currCount > prevCount) {
                            valid = false;
                        }
                    }

                    prevValue = value;
                    prevCount = currCount;
                }

                System.out.println(valid ? "YES" : "NO");
            }

            sc.close();
        }

}
