import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("ABC");
        al.add("def");
        al.add("gh");

        // forで取り出す
        for(String s : al){
            System.out.println(s);
        }

        // sort
        ArrayList<Integer> bl = new ArrayList<>();
        bl.add(2);
        bl.add(5);
        bl.add(1);
        bl.sort(((o1, o2) -> o1 - o2));
    }
}
