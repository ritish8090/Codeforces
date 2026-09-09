import java.util.*;
public class Creating_Abbreviations_2257A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();

                boolean[] available = new boolean[26];

                for (int i = 0; i < n; i++) {
                    String s = sc.next();
                    available[s.charAt(0) - 'a'] = true;
                }

                String[] a = new String[m];

                for (int i = 0; i < m; i++) {
                    a[i] = sc.next();
                }

                boolean[] used = new boolean[m];
                int count = 0;

                while (true) {
                    boolean changed = false;

                    for (int i = 0; i < m; i++) {
                        if (used[i]) {
                            continue;
                        }

                        boolean possible = true;

                        for (char c : a[i].toCharArray()) {
                            if (!available[c - 'A']) {
                                possible = false;
                                break;
                            }
                        }

                        if (possible) {
                            used[i] = true;
                            count++;
                            available[a[i].charAt(0) - 'A'] = true;
                            changed = true;
                        }
                    }

                    if (!changed) {
                        break;
                    }
                }

                System.out.println(count == m ? "YES" : "NO");
            }
        }
}
