public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) { //constructor
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() { //addition
        return num1 + num2;
    }

    public double subtract() { //subtraction
        return num1 - num2;
    }

    public double multiply() { //multiplication
        return num1 * num2;
    }

    public double divide() { //division
        return num1 / num2;
    }

    public double mod() { //modulus
        return num1 % num2;
    }

    public double exponent() { //exponentiation
        return Math.pow(num1, num2);
    }
}
