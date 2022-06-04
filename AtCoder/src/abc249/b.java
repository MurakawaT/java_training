import java.util.HashSet;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        int aint = (int)'A';

        HashSet<Character> hashSet = new HashSet<Character>();
        HashSet<Integer> hashSet2 = new HashSet<Integer>();

        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            hashSet.add(c);
            int cint = (int) c;
//            System.out.println(c + " " + (cint - aint));
            Integer low = (cint - aint)/32;
            hashSet2.add(low);
        }

        if (hashSet.size() == S.length() && hashSet2.size() == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
//        System.out.println(hashSet2);
    }
}
