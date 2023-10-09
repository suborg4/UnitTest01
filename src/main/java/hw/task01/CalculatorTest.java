package hw.task01;

public class Calpublic class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }


    public static double squareRootExtraction(double num) {

        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {

        double resultAmount = purchaseAmount - ((double) discountAmount / 100 * purchaseAmount);
        if (purchaseAmount < 1)
            throw new IllegalArgumentException("Покупка должна быть не менее 1 USD");
        if (discountAmount < 0) throw new IllegalArgumentException("Сумма скидки не может быть отрицательной");
        return resultAmount;
    }
}