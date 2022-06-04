import java.util.Arrays;

public class bitFullSearch {
    public static void bitFullSearch() {

        // 2^N 通りを全探索
        int N = 3;
        int[] x = new int[N];
        for (int i = 0; i < 1 << N; i++) {
            for (int j = 0; j < N; j++) {
                if ((1 & i >> j) == 1)
                    x[j] = 1;
                else
                    x[j] = 0;
            }
            Arrays.stream(x).forEach(k -> System.out.print(k + " "));
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        bitFullSearch();
    }
}
