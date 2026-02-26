import java.io.*;
import java.util.*;

public class simons_and_cakes_for_success_b {
        public static void main(String[] args) throws Exception {
            FastScanner fs = new FastScanner(System.in);
            StringBuilder out = new StringBuilder();

            int t = fs.nextInt();
            while (t-- > 0) {
                long n = fs.nextLong();
                long temp = n;
                long k = 1;

                for (long p = 2; p * p <= temp; p++) {
                    if (temp % p == 0) {
                        int cnt = 0;
                        while (temp % p == 0) {
                            temp /= p;
                            cnt++;
                        }
                        // exponent needed in k
                        int need = (cnt + (int)n - 1) / (int)n;
                        for (int i = 0; i < need; i++) {
                            k *= p;
                        }
                    }
                }

                // If remaining prime factor exists
                if (temp > 1) {
                    // exponent is 1
                    // ceil(1 / n) = 1
                    k *= temp;
                }

                out.append(k).append('\n');
            }

            System.out.print(out.toString());
        }

        // Fast input
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

            long nextLong() throws IOException {
                int c, sign = 1;
                long val = 0;
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
