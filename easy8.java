class easy8 {
    public static void main(String arg[]) {
        int M = 50; 
        int N = 100;
        int K = 7;
        for (int i = M; i <= N;i=(i+K+1)) {
            System.out.print(i+", ");
        }
    }
}
