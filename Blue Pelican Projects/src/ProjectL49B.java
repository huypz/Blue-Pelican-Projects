import java.util.*;

public class ProjectL49B extends StackLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        StackLL calculatorStack = new StackLL();

        do {
            System.out.print("Enter number, math operation(+,-,*, or /), or Q to quit: ");
            input = sc.nextLine();

            if (input.equals("Q")) {
                System.out.println("The answer is: " + calculatorStack.pop());
                break;
            }

            double a, b;
            switch (input) {
                case "+":
                    a = calculatorStack.pop();
                    b = calculatorStack.pop();
                    calculatorStack.push(a + b);
                    break;
                case "-":
                    a = calculatorStack.pop();
                    b = calculatorStack.pop();
                    calculatorStack.push(b - a);
                    break;
                case "*":
                    a = calculatorStack.pop();
                    b = calculatorStack.pop();
                    calculatorStack.push(a * b);
                    break;
                case "/":
                    a = calculatorStack.pop();
                    b = calculatorStack.pop();
                    calculatorStack.push(b / a);
                    break;
                default:
                    calculatorStack.push(Double.parseDouble(input));
            }

        } while (true);
    }
}
