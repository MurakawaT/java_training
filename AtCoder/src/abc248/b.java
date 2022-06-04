package abc248;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        long a,b,k;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        k = sc.nextInt();

        int ans = 0;
        while (a < b){
            ans += 1;
            a *= k;
        }

        System.out.println(ans);
    }
}
