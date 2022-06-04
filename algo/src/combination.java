public class combination {
    public static long[][] nCrCount(){
        int MAX = 2000;
        int MOD = 1000000009;
        long[][] com = new long[MAX][MAX];
        for(int i = 0; i < MAX; i++)
            com[i][0] = 1;
        for(int i = 1; i < MAX; i++) {
            for(int j = 1; j <= i; j++) {
                com[i][j] = com[i-1][j-1] + com[i-1][j];
                com[i][j] %= MOD;
            }
        }
        return com;
    }

    public static void main(String[] args) {
        long[][] com = nCrCount();
        System.out.println(com[5][2]);
    }
}
