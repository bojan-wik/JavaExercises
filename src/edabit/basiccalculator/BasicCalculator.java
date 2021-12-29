package edabit.basiccalculator;

public class BasicCalculator {

    public static int calculator(int num1, char operator, int num2) {
        int calculationResult = 0;
        switch(operator) {
            case '+':
                calculationResult = num1 + num2;
                break;
            case '-':
                calculationResult = num1 - num2;
                break;
            case '*':
                calculationResult = num1 * num2;
                break;
            case '/':
                switch(num2) {
                    case 0:
                        break;
                    default:
                        calculationResult = num1 / num2;
                }
        }
        return calculationResult;
    }

    public static void main(String[] args) {
        System.out.println(calculator(25, '/', 0));
    }
}
