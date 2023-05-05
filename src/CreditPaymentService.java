public class CreditPaymentService {
    public int calculate(int amount, double loanRate, int term) {
        double monthlyRate = loanRate / 100 / 12;
        double operationOne = 1 + monthlyRate;
        double operationTwo = Math.pow(operationOne, -term);
        double operationThree = 1 - operationTwo;
        double operationFour = monthlyRate / operationThree;
        double monthlyPayment = amount * operationFour;

        return (int) monthlyPayment;

    }
}
