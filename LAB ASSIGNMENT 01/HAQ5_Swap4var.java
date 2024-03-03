public class HAQ5_Swap4var {
    public static void main(String[] args) {
        int W = 5, G = 10, K = 15, A = 20;

        int t=W;
        W=G;
        G=K;
        K=A;
        A=t;

        System.out.println("W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);
    }
}