import java.util.*;
public class Boss_Fight_2252A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                Map<Integer, Integer> map = new HashMap<>();

                long sum = 0;

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    sum += a[i];
                    map.put(a[i], map.getOrDefault(a[i], 0) + 1);
                }

                int maxFreq = 0;
                int maxValue = 0;

                for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                    if (e.getValue() > maxFreq) {
                        maxFreq = e.getValue();
                        maxValue = e.getKey();
                    }
                }

                if (maxFreq <= (n + 1) / 2) {
                    System.out.println(sum);
                } else {
                    int other = n - maxFreq;
                    long otherSum = sum - (long) maxFreq * maxValue;

                    long ans = otherSum + (long) (other + 2) * maxValue;
                    System.out.println(ans);
                }
            }
        }
}
