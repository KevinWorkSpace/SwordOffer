package Offer64;

public class SumNums {

    int res;

    public int sumNums(int n) {
        boolean f = n >= 1 && sumNums(n - 1) > 0;
        res += n;
        return res;
    }
}
