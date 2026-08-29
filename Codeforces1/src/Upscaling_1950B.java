import java.util.*;
public class Upscaling_1950B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int size = 2 * n;

                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if ((i / 2 + j / 2) % 2 == 0) {
                            System.out.print('#');
                        } else {
                            System.out.print('.');
                        }
                    }
                    System.out.println();
                }
            }
        }
}
