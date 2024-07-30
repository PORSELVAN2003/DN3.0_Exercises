public class FinancialForecasting {
    public static void main(String[] args) {
        double initialInvestment = 1000.0;
        double growthRate = 0.05;
        int years = 5;

        double futureValue = calculateFV(initialInvestment, growthRate, years);
        System.out.printf("Future value after %d years: %.2f\n", years, futureValue);
    }

    public static double calculateFV(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return calculateFV(principal * (1 + rate), rate, years - 1);
    }
}
