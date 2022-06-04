package abc248;

import java.util.Scanner;

public class c_ans {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[][] a = new int[n + 1][k + 1];
        a[0][0] = 1;
        for (int x = 1; x <= n; x++) {
            for (int y = 0; y <= k; y++) {
                int sum = 0;
                for (int i = 1; i <= m; i++) {
                    if (y - i >= 0) {
                        sum += a[x - 1][y - i];
                        sum %= 998244353;
                    }
                }
                a[x][y] = sum;
            }
        }
        int ans = 0;
        for (int y = 0; y <= k; y++) {
            ans += a[n][y];
            ans %= 998244353;
        }
        System.out.println(ans);
    }
}