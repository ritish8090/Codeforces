import java.util.*;
public class Keep_it_Beautiful_1841B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int q = sc.nextInt();
                int first = -1;
                int last = -1;
                boolean rotated = false;
                StringBuilder ans = new StringBuilder();

                for (int i = 0; i < q; i++) {
                    int x = sc.nextInt();

                    if (first == -1) {
                        first = x;
                        last = x;
                        ans.append('1');
                    } else if (!rotated) {
                        if (x >= last) {
                            last = x;
                            ans.append('1');
                        } else if (x <= first) {
                            rotated = true;
                            last = x;
                            ans.append('1');
                        } else {
                            ans.append('0');
                        }
                    } else {
                        if (x >= last && x <= first) {
                            last = x;
                            ans.append('1');
                        } else {
                            ans.append('0');
                        }
                    }
                }

                System.out.println(ans);
            }
            sc.close();
        }
}
