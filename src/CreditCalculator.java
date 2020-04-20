public class CreditCalculator {
    public int calculate(long summ, int countMonth, float percent){
        float percentMonth = percent / 100 / 12;
        float annuitant = (float) (percentMonth * (Math.pow((1 + percentMonth),countMonth))/(Math.pow((1+percentMonth),countMonth)-1));
        float monthlyPaymentt = (summ * annuitant);
        int monthlyPayment = (int) monthlyPaymentt;
        return monthlyPayment;
    }
}
