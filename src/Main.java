import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calculator!");
        System.out.print("Enter an expression with +, - , * , /, %, or ^: ");
        String 字 = input.nextLine();

        double num1 = Double.parseDouble(字.substring(0, 字.indexOf(" ")));
        String op = 字.substring(字.indexOf(" ") + 1, 字.indexOf(" ") + 2);
        double num2 = Double.parseDouble(字.substring(字.indexOf(op) + 2));
        Calculator calc = new Calculator(num1, num2);
        System.out.print("The result of " + 字 + " is: ");

        switch (op) {
            case "+" -> System.out.println(calc.add());
            case "-" -> System.out.println(calc.subtract());
            case "*" -> System.out.println(calc.multiply());
            case "/" -> System.out.println(calc.divide());
            case "%" -> System.out.println(calc.mod());
            case "^" -> System.out.println(calc.exponent());
        }
    }
}
