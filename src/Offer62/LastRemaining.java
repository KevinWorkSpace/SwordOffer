package Offer62;

public class LastRemaining {

    public int lastRemaining(int n, int m) {
        if (n == 1) {
            return 0;
        }
        return (lastRemaining(n-1, m) + m) % n;
    }

    public static void main(String[] args) {
        LastRemaining lastRemaining = new LastRemaining();
        lastRemaining.lastRemaining(5, 3);
    }
}
