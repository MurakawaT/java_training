package abc248;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int ans = 45;
        for(int i=0; i<S.length(); i++){
            Character c = S.charAt(i);
            int ci = Integer.parseInt(c.toString());
            ans -= ci;
        }

        System.out.println(ans);
    }
}
