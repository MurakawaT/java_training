package abc248;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int[] a = new int[n];
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
        for(int i=0; i<n; i++){
//            a[i] = sc.nextInt();
            int ai = sc.nextInt();
            ArrayList<Integer> v = hm.getOrDefault(ai,new ArrayList<Integer>());
            v.add(i+1);
            hm.put(ai,v);
        }

        for(Integer key : hm.keySet()){
            ArrayList<Integer> v = hm.get(key);
            v.sort((o1,o2) -> o1 - o2);
            hm.put(key,v);
        }

        ArrayList<Integer> ans = new ArrayList<>();
//        System.out.println(hm);

        int que = sc.nextInt();
        for(int i=0; i<que; i++){
            int l = sc.nextInt();
            int r = sc.nextInt()+1;
            int q = sc.nextInt();
            ArrayList<Integer> v  = hm.getOrDefault(q,new ArrayList<Integer>());
            int tmpans = 0;
//            System.out.println(q + " " + v + " "+l+ " "+r);
            if (v.size() != 0) {
                tmpans = lowerbound(v, r) - lowerbound(v, l);
            }
            ans.add(tmpans);
        }

//        System.out.println(ans);
        ans.stream().forEach(e-> System.out.println(e));

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
