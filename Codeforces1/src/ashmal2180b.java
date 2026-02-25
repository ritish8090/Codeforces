import java.util.*;

public class ashmal2180b {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = "";

                for (int i = 0; i < n; i++) {
                    String a = sc.next();
                    if (s.isEmpty()) {
                        s = a;
                    } else {
                        String front = a + s;
                        String back = s + a;
                        if (front.compareTo(back) < 0) {
                            s = front;
                        } else {
                            s = back;
                        }
                    }
                }

                System.out.println(s);
            }
            sc.close();
        }
}
