import java.util.*;
import java.io.*;
public class Homework_2132A {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                br.readLine();
                String a = br.readLine().trim();
                br.readLine();
                String b = br.readLine().trim();
                String c = br.readLine().trim();

                StringBuilder front = new StringBuilder();
                StringBuilder back = new StringBuilder();

                for (int i = 0; i < b.length(); i++) {
                    if (c.charAt(i) == 'V') front.insert(0, b.charAt(i));
                    else back.append(b.charAt(i));
                }

                sb.append(front).append(a).append(back).append('\n');
            }

            System.out.print(sb);
        }
}
