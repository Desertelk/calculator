import java.util.Scanner;

public class calculator {
    public static void main(String[] args) throws Exception {
        Scanner userIn = new Scanner(System.in);
        char userOperation = 0;
        double currentNumber; 
        double answer; 
        System.out.print("Please input the first number: ");
        double firstNumber = userIn.nextDouble();

        while(userOperation != 'q'){
            currentNumber = firstNumber;
            userOperation = userIn.next().charAt(0);
            double secondNumber = userIn.nextDouble();

            switch(userOperation){
                case '+':
                    answer = addNumbers(currentNumber, secondNumber);
                    currentNumber = answer;
                    firstNumber = currentNumber;
                    System.out.println(answer);
                    break;
                case '-':
                    answer = subtractNumbers(currentNumber, secondNumber);
                    currentNumber = answer;
                    firstNumber = currentNumber;
                    System.out.println(answer);
                    break;
                case '*': 
                    answer = multiplyNumbers(currentNumber, secondNumber);
                    currentNumber = answer;
                    firstNumber = currentNumber;
                    System.out.println(answer);
                    break;
                case '/':
                    answer = divideNumbers(currentNumber, secondNumber);
                    currentNumber = answer;
                    firstNumber = currentNumber;
                    System.out.println(answer);
                    break;
                case 'q':
                    userIn.close();
                    break;
                default:
                    System.out.println("That isn't a valid option, please try again");
            }
        }
    }

    public static double addNumbers(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtractNumbers(double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }

    public static double multiplyNumbers(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }

    public static double divideNumbers(double firstNumber, double secondNumber){
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return firstNumber / secondNumber;
    }
}
