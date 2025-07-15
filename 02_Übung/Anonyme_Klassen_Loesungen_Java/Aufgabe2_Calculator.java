interface Operation {
    int execute(int a, int b);
}

class Calculator {
    public int calculate(int a, int b, Operation op) {
        return op.execute(a, b);
    }
}

public class Aufgabe2_Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Operation add = new Operation() {
            public int execute(int a, int b) { return a + b; }
        };
        Operation sub = new Operation() {
            public int execute(int a, int b) { return a - b; }
        };
        Operation mul = new Operation() {
            public int execute(int a, int b) { return a * b; }
        };
        Operation div = new Operation() {
            public int execute(int a, int b) { return a / b; }
        };

        System.out.println("Addition: " + calc.calculate(10, 5, add));
        System.out.println("Subtraktion: " + calc.calculate(10, 5, sub));
        System.out.println("Multiplikation: " + calc.calculate(10, 5, mul));
        System.out.println("Division: " + calc.calculate(10, 5, div));
    }
}