import java.util.*;
public class Milica_and_String_1898A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                String s = sc.next();

                int countB = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == 'B') {
                        countB++;
                    }
                }

                if (countB == k) {
                    System.out.println(0);
                } else if (countB < k) {
                    int need = k - countB;
                    int countA = 0;
                    int i = 0;

                    while (i < n && countA < need) {
                        if (s.charAt(i) == 'A') {
                            countA++;
                        }
                        i++;
                    }

                    System.out.println(1);
                    System.out.println(i + " B");
                } else {
                    int need = countB - k;
                    int count = 0;
                    int i = 0;

                    while (i < n && count < need) {
                        if (s.charAt(i) == 'B') {
                            count++;
                        }
                        i++;
                    }

                    System.out.println(1);
                    System.out.println(i + " A");
                }
            }

            sc.close();
        }
}
