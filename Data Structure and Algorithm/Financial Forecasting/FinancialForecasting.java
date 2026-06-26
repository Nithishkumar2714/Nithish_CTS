public class FinancialForecasting {
    public static double calculateFutureValueRecursive(double currentValue,
                                                       double growthRate,
                                                       int years) {
        if (years == 0) {
            return currentValue;
        }
        return calculateFutureValueRecursive(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1
        );
    }
    public static double calculateFutureValueIterative(double currentValue,
                                                       double growthRate,
                                                       int years) {
        for (int i = 0; i < years; i++) {
            currentValue = currentValue * (1 + growthRate);
        }
        return currentValue;
    }
    public static void main(String[] args) {
        double presentValue = 10000.0;
        double growthRate = 0.08; // 8%
        int years = 5;
        double recursiveResult = calculateFutureValueRecursive(
                presentValue,
                growthRate,
                years
        );
        double iterativeResult = calculateFutureValueIterative(
                presentValue,
                growthRate,
                years
        );
        System.out.println("=== Financial Forecasting ===");
        System.out.println("Present Value : ₹" + presentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);

        System.out.printf("\nFuture Value (Recursive): ₹%.2f%n",
                recursiveResult);
        System.out.printf("Future Value (Iterative): ₹%.2f%n",
                iterativeResult);
        System.out.println("\n=== Complexity Analysis ===");
        System.out.println("Recursive Approach:");
        System.out.println("Time Complexity  : O(n)");
        System.out.println("Space Complexity : O(n)");
        System.out.println("\nIterative Approach:");
        System.out.println("Time Complexity  : O(n)");
        System.out.println("Space Complexity : O(1)");
    }
}