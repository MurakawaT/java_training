package abc249;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        int N;
        int K;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();
        ArrayList<String> S = new ArrayList<>();
        for (int i=0; i<N; i++){
//            String s = scanner.nextLine();
//            S.add(s);
            S.add(scanner.next());
        }
        scanner.close();

        for(String s : S){
//            System.out.println(s);
        }

        int ans = 0;

        for(int i=0; i<1<<N; i++){
            ArrayList<String> al = new ArrayList<>();
            for(int j=0; j<N; j++){
                if((1 & i >> j) == 1){
                    al.add(S.get(j));
//                    System.out.println(j + " " +S.get(j));
                }
            }

            HashMap<Character, Integer>hashMap = new HashMap<Character, Integer>();
            for(String s : al){
                for(int j=0; j<s.length(); j++){
                    Character c = s.charAt(j);
                    int v = hashMap.getOrDefault(c,0);
                    hashMap.put(c,v+1);
                }
            }
            int tmpans = 0;
            for(Character c : hashMap.keySet()){
                if (hashMap.get(c) == K){
                    tmpans += 1;
                }
            }
//            System.out.println(hashMap + " " +i + al);
            ans = Math.max(ans, tmpans);
        }

        System.out.println(ans);
    }
}
