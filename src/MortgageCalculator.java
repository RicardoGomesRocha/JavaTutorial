import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public float loanAmount = 0;
    public float annualInterestRate = 0;
    private int periodYears = 0;

    public MortgageCalculator() {}

    public double calculate() {
        float p = this.loanAmount;
        float r = this.annualInterestRate / 12 / 100;
        float n = this.periodYears * 12;
        return p * ( (r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1));
    }
    public static void call() {
        MortgageCalculator calculator = MortgageCalculator.getDataFromUser();
        System.out.println("Mortage: " + NumberFormat.getCurrencyInstance().format(calculator.calculate()));
    }

    public static MortgageCalculator getDataFromUser() {
        MortgageCalculator calculator = new MortgageCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Load Amount: ");
        calculator.loanAmount = scanner.nextFloat();
        System.out.print("Annual Interest Rate: ");
        calculator.annualInterestRate = scanner.nextFloat();
        System.out.print("Period (Years): ");
        calculator.periodYears = scanner.nextInt();
        return calculator;
    }

}
