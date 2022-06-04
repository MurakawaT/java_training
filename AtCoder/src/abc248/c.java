package abc248;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        int n,m,k;
        long mod = 998244353;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        long[] dp = new long[k+1];
        long[] dp2 = new long[k+1];

        for(int j=1; j<=Math.min(m,k); j++){
            dp[j] = 1;
        }

        for(int i=1; i<n; i++){

//            Arrays.stream(dp).forEach(e -> System.out.print(e+" "));
//            System.out.println();

            for(int j=1; j<k+1; j++){
                dp2[j] = 0;
                dp2[j] += dp[j] + dp2[j-1];
                dp2[j] %= mod;
            }
            for(int j=1; j<k+1; j++){
                dp[j] = 0;
                dp[j] += dp2[j-1];
                if (j- m -1 >= 0) {
//                    System.out.println(j-m);
                    dp[j] -= dp2[j - m -1];
                }
                dp[j] %= mod;
            }

//            Arrays.stream(dp2).forEach(e -> System.out.print(e+" "));
//            System.out.println();
//
//            Arrays.stream(dp).forEach(e -> System.out.print(e+" "));
//            System.out.println();
//
//            System.out.println("----");
        }

        long ans = 0;
        for(int i=0; i<k+1; i++){
            ans += dp[i];
            ans %= mod;
        }
        System.out.println((ans + mod)%mod);

    }
}
