package Strategy;

public class SimpleSumStrategy implements SumStrategy {
    @Override
    public int get(int n) {
        int sum = n;
        for(int i=1; i<n; i++) {
            sum += n;
        }

        return sum;
    }
}
