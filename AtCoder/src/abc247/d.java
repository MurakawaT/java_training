package abc247;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Deque<ArrayList<Long>> deque = new ArrayDeque<ArrayList<Long>>();

        Scanner sc = new Scanner(System.in);
        Long q = sc.nextLong();

        ArrayList<Long> ans = new ArrayList<>();

        for(int i=0; i<q; i++){
//            System.out.println(deque);
            Long query = sc.nextLong();
            if (query == 1){
                Long x = sc.nextLong();
                Long c = sc.nextLong();

                ArrayList<Long> al = new ArrayList<>();
                al.add(x);
                al.add(c);

                deque.addLast(al);
            }else{
                Long c = sc.nextLong();
                long tmpans = 0;
                while (c > 0) {
//                    System.out.println(deque);
                    ArrayList<Long> top = deque.pollFirst();
                    Long nowx = top.get(0);
                    Long nowc = top.get(1);
                    if (c >= nowc){
                        tmpans += nowc*nowx;
                        c -= nowc;
                    }else{
                        tmpans += c*nowx;
                        nowc -= c;
                        c = 0L;
                        ArrayList<Long> top2 = new ArrayList<>();
                        top2.add(nowx);
                        top2.add(nowc);
                        deque.addFirst(top2);
                    }
                }
                ans.add(tmpans);
            }
        }
        ans.stream().forEach(e -> System.out.println(e));
    }
}
