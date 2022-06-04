import java.util.Scanner;

public class input {

    // 文字列入力例
    // 例:atcoder
    public static String S(){
        Scanner scanner = new Scanner(System.in);

//       なぜか一行無視される
//       String ret = scanner.nextLine();

        String ret = scanner.next();

        return ret;
    }

    public static int N(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        return N;
    }

    public static void main(String[] args) {

    }
}
