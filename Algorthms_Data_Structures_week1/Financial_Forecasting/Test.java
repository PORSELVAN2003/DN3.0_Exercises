public class Test {
    public static void main(String[] args) {
        calculateFV();
        calculateFVWithPast();
    }

    private static void calculateFV() {
        double initialInvestment = 1000.0;
        double growthRate = 0.05;
        int years = 5;

        double expectedValue = 1000.0 * Math.pow(1 + growthRate, years);
        double actualValue = FinancialForecasting.calculateFV(initialInvestment, growthRate, years);

        System.out.printf("Calculate Future Value:\n");
        System.out.printf("Expected: %.2f\n", expectedValue);
        System.out.printf("Actual: %.2f\n", actualValue);
        System.out.printf("Result: %s\n\n", Math.abs(expectedValue - actualValue) < 0.01 ? "Passed" : "Failed");
    }

    private static void calculateFVWithPast() {
        double initialInvestment = 1000.0;
        double growthRate = 0.05;
        int years = 5;

        double expectedValue = 1000.0 * Math.pow(1 + growthRate, years);
        double actualValue = ForecastingMemoized.calculateFV(initialInvestment, growthRate, years);

        System.out.printf("Calculate Future Value Based on Past:\n");
        System.out.printf("Expected: %.2f\n", expectedValue);
        System.out.printf("Actual: %.2f\n", actualValue);
        System.out.printf("Result: %s\n\n", Math.abs(expectedValue - actualValue) < 0.01 ? "Passed" : "Failed");
    }
}
