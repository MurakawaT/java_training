package abc249;

import java.util.Scanner;

public class d_ans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] count = new long[200001];
        for(int i = 0;i < N;i++) {
            int tmp = sc.nextInt();
            count[tmp]++;
        }

        long ans = 0;
        for(int i = 1;i <= 200000;i++) {
            for(int j = 1;i*j <= 200000;j++) {
                ans += count[i]*count[j]*count[i*j];
            }
        }

        System.out.println(ans);
    }
}
