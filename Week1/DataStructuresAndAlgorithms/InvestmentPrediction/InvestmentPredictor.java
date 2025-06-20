package Week1.DataStructuresAndAlgorithms.InvestmentPrediction;

public class InvestmentPredictor {

    public static double calculateFutureAmount(double initialAmount, double rateOfIncrease, int durationInYears) {
        if (durationInYears == 0) {
            return initialAmount;
        }
        return (1 + rateOfIncrease) * calculateFutureAmount(initialAmount, rateOfIncrease, durationInYears - 1);
    }

    public static void main(String[] args) {
        double initialAmount = 75000.0;
        double rateOfIncrease = 0.08;
        int durationInYears = 8;

        double projectedAmount = calculateFutureAmount(initialAmount, rateOfIncrease, durationInYears);
        System.out.printf("Estimated amount after %d years: %.2f\n", durationInYears, projectedAmount);
    }
}
