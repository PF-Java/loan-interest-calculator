public class CalculateIntersetRates {
    public static void main(String[] args) {
        double loans = 6000;
        double interest_rate = 0.075;
        double months = 60;
        double range;

        double capital = loans / months;
        System.out.println("Principal pay in " + months + " months: " + capital);

        range = 0;
        double first_year_interest = calculateInterest(loans, interest_rate, range);

        range = 0.035;
        double next_year_interest = calculateInterest(loans, interest_rate, range);
        System.out.println("Next year interest: " + next_year_interest);

        System.out.println("Monthly paid in the first year: " + (capital + first_year_interest));
        System.out.println("Monthly paid in the next year: " + (capital + next_year_interest));
    }

    public static double calculateInterest(double loans, double interest_rate, double range) {
        return loans * ((interest_rate + range) / 12);
    }
}
