import java.util.Scanner;

public class calculator {
    public static void main(String[] args) throws Exception {
        Scanner userIn = new Scanner(System.in);
        char userOperation = 0;
        int currentNumber; 
        int answer; 
        System.out.println("Please input the first number, the operation you would like to perform and the second number");
        int firstNumber = userIn.nextInt();

        while(userOperation != 'q'){
            currentNumber = firstNumber;
            int secondNumber = userIn.nextInt();
            userOperation = userIn.next().charAt(0);

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
                    System.out.println(answer);
                    break;
                case '/':
                    answer = divideNumbers(currentNumber, secondNumber);
                    currentNumber = answer;
                    System.out.println(answer);
                    break;
                case 'q':
                    userIn.close();
                    break;
            }
        }
    }

    public static int addNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtractNumbers(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public static int multiplyNumbers(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public static int divideNumbers(int firstNumber, int secondNumber){
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return firstNumber / secondNumber;
    }
}
