package Ex01;

public class CarInsurance {
    private final double basisPremium; // invariant: basisPremium > 0.

    /**
     * Create a CarInsurance.
     * Pre: basisPremium > 0.
     */
    public CarInsurance(double basisPremium) {
        this.basisPremium = basisPremium;
    }

    /**
     * Calculate and return a premium based of the following rules:
     * - person with age below 25: 25% is added to the basis premium,
     * - woman: the basis premium is reduced with 5%,
     * - if the person have been driving without damages for:
     * - 0 to 2 years, the basis premium is reduced with 0%,
     * - 3 to 5 years, the basis premium is reduced with 15%,
     * - 6 to 8 years, the basis premium is reduced with 25%,
     * - more than 8 years, the basis premium is reduced with 35%.
     * Throws a RuntimeException, if age < 18, or yearsWithoutDamage < 0,
     * or YearsWithoutDamage > age-18.
     */
    public double calculatePremium(int age, boolean isWoman, int yearsWithoutDamage) {
        double sum = basisPremium;
        if (age < 18 || yearsWithoutDamage < 0 || yearsWithoutDamage > 18) {
            throw new RuntimeException("REEEEEEEEEEEEEEEEEEEEEEEEEE");
        }
        if (age < 25) {
            sum = sum * 1.25;
        }
        if (isWoman) {
            sum = sum * 0.95;
        }
        if (isBetween(yearsWithoutDamage, 3, 5)) {
            sum = sum * 0.85;
        }
        if (isBetween(yearsWithoutDamage, 6, 8)) {
            sum = sum * 0.75;
        }
        if (yearsWithoutDamage > 8) {
            sum = sum * 65;
        }
        return sum;
    }

    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }
}
