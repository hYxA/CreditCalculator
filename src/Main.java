public class Main {
    public static void main(String[] args) {
        long summ = 1_000_000; // Сумма кредита
        int countMonth = 12;   // Срок кредита
        float percent = 9.99F;  // Процентная ставка в процентах
        float monthlyPayment;   // Ежемесячный платеж

        CreditCalculator creditCalculator = new CreditCalculator();

        monthlyPayment = creditCalculator.calculate(summ, countMonth, percent);
        System.out.println ("Ежемесячный платёж = " + Math.floor(monthlyPayment));

        monthlyPayment = creditCalculator.calculate(summ, 24, percent);
        System.out.println ("Ежемесячный платёж = " + Math.round(monthlyPayment));

        monthlyPayment = creditCalculator.calculate(summ, 36, percent);
        System.out.println ("Ежемесячный платёж = " + Math.round(monthlyPayment));
    }
}
