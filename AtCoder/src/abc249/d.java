package abc249;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class d {
    public static ArrayList<Integer> al = new ArrayList<>();
    public static HashSet<Integer> hs = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=0; i<N; i++){
            Integer tmp_i = scanner.nextInt();
            al.add(tmp_i);
            hs.add(tmp_i);
        }
        scanner.close();

        al.sort(((o1, o2) -> o1 - o2));

        int ans = 0;

        for(Integer b : hs){
            int b_count = 0;
            int a_count = 0;
            b_count = upperbound(al,b) - lowerbound(al,b);
            for(int a=1; a<Math.sqrt(N)+1; a++){
                if (N%a == 0){
                    a_count = upperbound(al,a) - lowerbound(al,a);
                    int c_count = 1;
                    if (a != N/a) {
                        c_count = upperbound(al, N / a) - lowerbound(al, N / a);
                    }
                    System.out.println(b + " " + a + " " + c_count);
                    ans += a_count * b_count * c_count;
                }
            }

        }
        System.out.println(ans);

    }

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

    public static int lowerbound(ArrayList<Integer> a, int key) {
        if(a.get(a.size()-1) < key)
            return a.size();
        int lb = 0, ub = a.size()-1, mid;
        do {
            mid = (ub+lb)/2;
            if(a.get(mid) < key)
                lb = mid + 1;
            else
                ub = mid;
        }while(lb < ub);
        return ub;
    }

    public static int upperbound(ArrayList<Integer> a, int key) {
        if(a.get(a.size()-1) <= key)
            return a.size();
        int lb = 0, ub = a.size()-1, mid;
        do {
            mid = (ub+lb)/2;
            if(a.get(mid) <= key)
                lb = mid + 1;
            else
                ub = mid;
        }while(lb < ub);
        return ub;
    }


}
