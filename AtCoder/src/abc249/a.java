import java.util.Arrays;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[7];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int taka = 0;
        int aoki = 0;
        for (int i = 0; i < a[6]; i++) {
            if ((i % (a[0] + a[2])) < a[0]) {
                taka += a[1];
//                System.out.println(a[0]);
//                System.out.println(a[2]);
//                System.out.println( (i+1) % (a[0] + a[2]) );
//                System.out.println(i + " " + taka);
            }
            if ((i % (a[3] + a[5]) ) < a[3]) {
                aoki += a[4];
//                System.out.println(a[3]);
//                System.out.println(a[5]);
//                System.out.println((a[3] + a[5]) % (i+1));
//                System.out.println(i + " "+ aoki);
            }

        }
//        System.out.println(taka + " " + aoki);
        if (taka==aoki){
            System.out.println("Draw");
        }else {
            System.out.println(aoki < taka? "Takahashi":"Aoki");
        }
    }
}
