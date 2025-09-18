import java.util.Scanner;

public class calculator {
    public static void main(String[] args) throws Exception {
        Scanner userIn = new Scanner(System.in);
        int currentNumber; 
        int answer; 
        System.out.println("Please input the first number, the operation you would like to perform and the second number");
        int firstNumber = userIn.nextInt();

        while(true){
            char userOperation = userIn.next().charAt(0);
            int secondNumber = userIn.nextInt();

            switch(userOperation){
                case '+':
                    answer = addNumbers(firstNumber, secondNumber);
                    currentNumber = answer;
                    firstNumber = currentNumber;
                    System.out.println(answer);
                case '-':
                    answer = subtractNumbers(firstNumber, secondNumber);
                    currentNumber = answer;
                    firstNumber = currentNumber;
                    System.out.println(answer);
                    
                case '*': 
                    answer = multiplyNumbers(firstNumber, secondNumber);
                    currentNumber = answer;
                    firstNumber = currentNumber;
                    System.out.println(answer);
                    
                case '/':
                    answer = divideNumbers(firstNumber, secondNumber);
                    currentNumber = answer;
                    firstNumber = currentNumber;
                    System.out.println(answer);
                case 'q':
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
