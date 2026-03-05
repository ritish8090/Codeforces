import java.util.*;
public class ASCII_art_contest_2172a {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int g = sc.nextInt();
            int c = sc.nextInt();
            int l = sc.nextInt();

            int max = Math.max(g, Math.max(c, l));
            int min = Math.min(g, Math.min(c, l));

            if (max - min >= 10) {
                System.out.println("check again");
            } else {
                int[] arr = {g, c, l};
                Arrays.sort(arr);
                System.out.println("final " + arr[1]);
            }

            sc.close();
        }
}
