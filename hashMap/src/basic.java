import java.util.HashMap;

public class basic {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        //入力
        hashMap.put('a',1);
        hashMap.put('b',1);

        //値取得
        int v = hashMap.get('a');
        System.out.println(v);

        //値がなかったときのデフォルト値
        v = hashMap.getOrDefault('c',0);
        System.out.println(v);

        //値の更新
        hashMap.put('a',3);
        System.out.println(hashMap);

        //for文で回す
        hashMap.forEach((key,value) -> System.out.println(key + " " + value));
        for(Character c : hashMap.keySet()){
            System.out.println(c + " " + hashMap.get(c));
        }
    }
}
