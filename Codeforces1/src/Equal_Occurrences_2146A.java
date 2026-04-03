import java.util.*;
public class Equal_Occurrences_2146A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];

                for (int i = 0; i < n; i++) a[i] = sc.nextInt();

                List<Integer> freq = new ArrayList<>();

                int count = 1;
                for (int i = 1; i < n; i++) {
                    if (a[i] == a[i - 1]) count++;
                    else {
                        freq.add(count);
                        count = 1;
                    }
                }
                freq.add(count);

                int maxFreq = 0;
                for (int f : freq) maxFreq = Math.max(maxFreq, f);

                int ans = 0;

                for (int x = 1; x <= maxFreq; x++) {
                    int cnt = 0;
                    for (int f : freq) {
                        if (f >= x) cnt++;
                    }
                    ans = Math.max(ans, cnt * x);
                }

                System.out.println(ans);
            }
        }
}
