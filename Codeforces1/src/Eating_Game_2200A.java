import java.util.*;
public class Eating_Game_2200A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                int total = 0;
                for (int i = 0; i < n; i++) { a[i] = sc.nextInt(); total += a[i]; }

                Set<Integer> winners = new HashSet<>();
                for (int start = 0; start < n; start++) {
                    int[] dishes = a.clone();
                    int remaining = total;
                    int cur = start;
                    int lastEater = -1;
                    while (remaining > 0) {
                        if (dishes[cur] > 0) {
                            dishes[cur]--;
                            remaining--;
                            lastEater = cur;
                        }
                        cur = (cur + 1) % n;
                    }
                    winners.add(lastEater);
                }
                System.out.println(winners.size());
            }
        }
}
