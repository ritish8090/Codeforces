import java.util.*;
public class Did_Not_Go_to_Print_2275B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                Stack<Integer> st = new Stack<>();
                boolean[] printed = new boolean[n + 1];

                for (int i = 1; i <= n; i++) {
                    char c = s.charAt(i - 1);

                    if (c == '1') {
                        st.push(i);
                    } else if (c == '2') {
                        if (st.isEmpty()) {
                            printed[i] = true;
                        } else {
                            printed[st.pop()] = true;
                        }
                    } else {
                        printed[i] = true;
                    }
                }

                List<Integer> ans = new ArrayList<>();

                for (int i = 1; i <= n; i++) {
                    if (!printed[i]) {
                        ans.add(i);
                    }
                }

                System.out.println(ans.size());

                for (int x : ans) {
                    System.out.print(x + " ");
                }

                System.out.println();
            }

            sc.close();
        }
}
