import java.util.*;
public class Secret_Sport_1894A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                boolean canA = false;
                boolean canB = false;

                for (int x = 1; x <= n; x++) {
                    int a = 0, b = 0;
                    int setsA = 0, setsB = 0;
                    boolean valid = true;
                    char lastWinner = '?';

                    for (int i = 0; i < n; i++) {
                        if (s.charAt(i) == 'A') {
                            a++;
                        } else {
                            b++;
                        }

                        if (a == x || b == x) {
                            if (a == x) {
                                setsA++;
                                lastWinner = 'A';
                            } else {
                                setsB++;
                                lastWinner = 'B';
                            }

                            a = 0;
                            b = 0;
                        }
                    }

                    if (a != 0 || b != 0) {
                        valid = false;
                    }

                    if (valid) {
                        if (setsA > setsB && lastWinner == 'A') {
                            canA = true;
                        }

                        if (setsB > setsA && lastWinner == 'B') {
                            canB = true;
                        }
                    }
                }

                if (canA && canB) {
                    System.out.println("?");
                } else if (canA) {
                    System.out.println("A");
                } else {
                    System.out.println("B");
                }
            }

            sc.close();
        }
}
