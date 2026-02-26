import java.io.*;
import java.util.*;
public class simons_and_making_it_beautiful_a {
        public static void main(String[] args) throws Exception {
            FastScanner fs = new FastScanner(System.in);
            StringBuilder out = new StringBuilder();

            int t = fs.nextInt();
            while (t-- > 0) {
                int n = fs.nextInt();
                int[] p = new int[n];

                for (int i = 0; i < n; i++) {
                    p[i] = fs.nextInt();
                }

                int prefixMax = 0;
                int uglyIndex = -1;

                // Find first ugly index
                for (int i = 0; i < n; i++) {
                    prefixMax = Math.max(prefixMax, p[i]);
                    if (prefixMax == i + 1) {
                        uglyIndex = i + 1; // 1-based
                        break;
                    }
                }

                if (uglyIndex != -1 && uglyIndex < n) {
                    int posI = -1, posN = -1;

                    for (int i = 0; i < n; i++) {
                        if (p[i] == uglyIndex) posI = i;
                        if (p[i] == n) posN = i;
                    }

                    int temp = p[posI];
                    p[posI] = p[posN];
                    p[posN] = temp;
                }

                for (int i = 0; i < n; i++) {
                    out.append(p[i]).append(' ');
                }
                out.append('\n');
            }

            System.out.print(out.toString());
        }

        // Fast input for competitive programming
        static class FastScanner {
            private final byte[] buffer = new byte[1 << 16];
            private int ptr = 0, len = 0;
            private final InputStream in;

            FastScanner(InputStream in) {
                this.in = in;
            }

            int read() throws IOException {
                if (ptr >= len) {
                    len = in.read(buffer);
                    ptr = 0;
                    if (len <= 0) return -1;
                }
                return buffer[ptr++];
            }

            int nextInt() throws IOException {
                int c, sign = 1, val = 0;
                do {
                    c = read();
                } while (c <= ' ');

                if (c == '-') {
                    sign = -1;
                    c = read();
                }

                while (c > ' ') {
                    val = val * 10 + (c - '0');
                    c = read();
                }
                return val * sign;
            }
        }
}
