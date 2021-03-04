package Offer62;

public class LastRemaining2 {

    public int lastRemaining(int n, int m) {
        int res = 0;
        for (int i=2; i<=n; i++) {
            res = (res + m) % i;
        }
        return res;
    }

    public static void main(String[] args) {
        LastRemaining2 lastRemaining = new LastRemaining2();
        lastRemaining.lastRemaining(5, 3);
    }
}
