import java.util.*;
public class One_one_2207A {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = Integer.parseInt(scanner.nextLine().trim());

            while (t-- > 0) {
                int n = Integer.parseInt(scanner.nextLine().trim());
                char[] s = scanner.nextLine().trim().toCharArray();

                char[] sMax = s.clone();
                boolean changed = true;
                while (changed) {
                    changed = false;
                    for (int i = 1; i < n - 1; i++) {
                        if (sMax[i] == '0' && sMax[i-1] == '1' && sMax[i+1] == '1') {
                            sMax[i] = '1';
                            changed = true;
                        }
                    }
                }

                char[] sMin = sMax.clone();
                changed = true;
                while (changed) {
                    changed = false;
                    for (int i = 1; i < n - 1; i++) {
                        if (sMin[i] == '1' && sMin[i-1] == '1' && sMin[i+1] == '1') {
                            sMin[i] = '0';
                            changed = true;
                        }
                    }
                }

                int maxOnes = 0, minOnes = 0;
                for (char c : sMax) if (c == '1') maxOnes++;
                for (char c : sMin) if (c == '1') minOnes++;

                System.out.println(minOnes + " " + maxOnes);
            }
        }
}
