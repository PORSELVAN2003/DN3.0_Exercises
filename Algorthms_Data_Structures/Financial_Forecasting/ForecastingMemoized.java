import java.util.HashMap;
import java.util.Map;

public class ForecastingMemoized {
    private static Map<Integer, Double> memo = new HashMap<>();

    public static void main(String[] args) {
        double initialInvestment = 1000.0;
        double growthRate = 0.05;
        int years = 5;

        double futureValue = calculateFV(initialInvestment, growthRate, years);
        System.out.printf("Future value after %d years with memoization: %.2f\n", years, futureValue);
    }

    public static double calculateFV(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }

        if (memo.containsKey(years)) {
            return memo.get(years);
        }

        double result = calculateFV(principal * (1 + rate), rate, years - 1);
        memo.put(years, result);
        return result;
    }
}
