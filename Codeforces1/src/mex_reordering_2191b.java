import java.io.*;
import java.util.*;
public class mex_reordering_2191b {
        public static void main(String[] args) throws Exception {
            FastScanner fs = new FastScanner(System.in);
            StringBuilder sb = new StringBuilder();

            int t = fs.nextInt();
            while (t-- > 0) {
                int n = fs.nextInt();
                int[] cnt = new int[n + 2];

                for (int i = 0; i < n; i++) {
                    cnt[fs.nextInt()]++;
                }

                // Find MEX
                int mex = 0;
                while (cnt[mex] > 0) mex++;

                boolean ok;
                if (mex == 0) {
                    ok = false;
                } else if (mex == 1) {
                    ok = (cnt[0] == 1);
                } else {
                    ok = true;
                }

                sb.append(ok ? "YES\n" : "NO\n");
            }

            System.out.print(sb.toString());
        }

        static class FastScanner {
            private final byte[] buffer = new byte[1 << 16];
            private int ptr = 0, len = 0;
            private final InputStream in;

            FastScanner(InputStream in) {
                this.in = in;
            }

            private int readByte() throws IOException {
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
                    c = readByte();
                } while (c <= ' ');
                if (c == '-') {
                    sign = -1;
                    c = readByte();
                }
                while (c > ' ') {
                    val = val * 10 + (c - '0');
                    c = readByte();
                }
                return val * sign;
            }
        }
}
