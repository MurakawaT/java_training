import java.util.*;

public class factorization {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            int N = scanner.nextInt();
//            System.out.println(divisor(N));
//        }
    }

    //約数列挙
    public static HashSet<Integer> divisor(int N){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=1; i<Math.sqrt(N)+1; i++){
            if (N%i==0){
                hs.add(i);
                hs.add(N/i);
            }
        }
        return hs;
    }

    //素因数分解
    public static void factorization(int N){
        Map<Integer, Integer> fact = new HashMap<>();
        for(int i = 2; i <= Math.sqrt(N); i ++) {
            if(N % i == 0) {
                int n = 0;
                while(N % i == 0) {
                    N /= i;
                    n++;
                }
                fact.put(i, n);
            }
        }
        if(N > 1)
            fact.put(N, 1);
    }

    //最小公倍数
    public static int gcd(int a, int b) {
        return b == 0 ? a: gcd(b, a % b);
    }

    //最大公約数
    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
