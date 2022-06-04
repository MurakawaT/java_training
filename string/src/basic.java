public class basic {
    public static void main(String[] args) {

        String s = "String";

        //　一文字ずつ見ていく
        for(int i= 0; i<s.length(); i++){
            Character c = s.charAt(i);
            String s_1 = c.toString();
            System.out.println(s_1);
        }
        System.out.println();

        // char <---> int
        int a_int = 65;
        char a_char = (char)a_int;
        System.out.println(a_char);

        // String <---> Integer
        String S = "1024";
        int I = Integer.parseInt(S);
        String S2 = ((Integer)I).toString();

    }
}
