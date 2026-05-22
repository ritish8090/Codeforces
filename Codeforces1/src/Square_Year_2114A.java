import java.io.*;
public class Square_Year_2114A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                String s = br.readLine();

                int num = Integer.parseInt(s);

                int root = (int) Math.sqrt(num);

                if (root * root != num) {
                    sb.append("-1\n");
                } else {
                    sb.append("0 ").append(root).append("\n");
                }
            }

            System.out.print(sb);
        }
}
