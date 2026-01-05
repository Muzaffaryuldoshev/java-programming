package operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 50;
        int weeklyHoyrs = 45;
        double stateTaxRate = 6;
        double federalTaxRate = 26;
        int weeksInYear = 52;

        double salaryBeforeTax = 50*(52 * 45);
        System.out.println("Salary before tax is: $" + salaryBeforeTax);
        double stateTax = salaryBeforeTax * stateTaxRate/100;
        System.out.println("State tax is: $" + stateTax);
        double federalTax = salaryBeforeTax * federalTaxRate/100;
        System.out.println("Federal tax is: $" + federalTax);
        double totalTax = stateTax + federalTax;
        System.out.println("Total tax is: $" + totalTax);
        double netIncome = salaryBeforeTax - totalTax;
        System.out.println("Net income is: $" + netIncome);

    }
}
