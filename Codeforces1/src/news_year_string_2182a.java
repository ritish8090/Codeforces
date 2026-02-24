import java.io.*;
public class news_year_string_2182a {

        static boolean contains(String s, String p) {
            for (int i = 0; i + p.length() <= s.length(); i++) {
                if (s.substring(i, i + p.length()).equals(p)) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder out = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                String s = br.readLine().trim();

                boolean has2025 = contains(s, "2025");
                boolean has2026 = contains(s, "2026");

                if (has2026 || !has2025) {
                    out.append(0).append('\n');
                } else {
                    out.append(1).append('\n');
                }
            }

            System.out.print(out);
        }
}
