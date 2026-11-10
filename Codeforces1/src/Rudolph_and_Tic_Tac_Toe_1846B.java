import java.util.*;
public class Rudolph_and_Tic_Tac_Toe_1846B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                char[][] a = new char[3][3];

                for (int i = 0; i < 3; i++) {
                    a[i] = sc.next().toCharArray();
                }

                String ans = "DRAW";

                for (int i = 0; i < 3; i++) {
                    if (a[i][0] != '.' && a[i][0] == a[i][1] && a[i][1] == a[i][2]) {
                        ans = String.valueOf(a[i][0]);
                        break;
                    }

                    if (a[0][i] != '.' && a[0][i] == a[1][i] && a[1][i] == a[2][i]) {
                        ans = String.valueOf(a[0][i]);
                        break;
                    }
                }

                if (ans.equals("DRAW")) {
                    if (a[0][0] != '.' && a[0][0] == a[1][1] && a[1][1] == a[2][2]) {
                        ans = String.valueOf(a[0][0]);
                    } else if (a[0][2] != '.' && a[0][2] == a[1][1] && a[1][1] == a[2][0]) {
                        ans = String.valueOf(a[0][2]);
                    }
                }

                System.out.println(ans);
            }

            sc.close();
        }

}
