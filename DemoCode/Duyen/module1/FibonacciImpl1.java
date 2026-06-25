
public class FibonacciImpl1 implements Fibonacci {
    @Override
    public long calculate(int n, boolean flag) {
        if (flag) {
            return deQuy(n);
        }
        return 0;
    }

    private long deQuy(int n) {
        if (n <= 1) return n;
        return deQuy(n - 1) + deQuy(n - 2);
    }
}