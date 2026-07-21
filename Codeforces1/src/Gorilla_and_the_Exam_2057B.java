import java.io.*;
import java.util.*;
public class Gorilla_and_the_Exam_2057B {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());

                HashMap<Integer, Integer> map = new HashMap<>();
                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) {
                    int x = Integer.parseInt(st.nextToken());
                    map.put(x, map.getOrDefault(x, 0) + 1);
                }

                ArrayList<Integer> freq = new ArrayList<>(map.values());
                Collections.sort(freq);

                int distinct = freq.size();

                for (int f : freq) {
                    if (distinct == 1) break;
                    if (k >= f) {
                        k -= f;
                        distinct--;
                    } else {
                        break;
                    }
                }

                out.append(distinct).append('\n');
            }

            System.out.print(out);
        }
}
