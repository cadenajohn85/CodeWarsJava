//Your job is to create a calculator which evaluates expressions in Reverse Polish notation.
//        For example expression 5 1 2 + 4 * + 3 - (which is equivalent to 5 + ((1 + 2) * 4) - 3 in normal notation)
//        should evaluate to 14.
//        For your convenience, the input is formatted such that a space is provided between every token.
//        Empty expression should evaluate to 0.
//        Valid operations are +, -, *, /.
//        You may assume that there won't be exceptional situations (like stack underflow or division by zero).

public class ReversePolish {
    public static double evaluate(String expr) {
        if (expr.equals("")) {
            return 0;
        }
        if (!expr.contains("+") && !expr.contains(" -") && !expr.contains("*") && !expr.contains("/")) {
            return Double.parseDouble(expr);
        }
        while (expr.contains(" ")) {
            expr = expr.replace(" ", "");
        }
        char[] array = expr.toCharArray();
        switch (array[array.length - 1]) {
            case '+':
                return (double) Character.digit(array[0], 10) + (double) Character.digit(array[1], 10);
            case '-':
                return (double) Character.digit(array[0], 10) - (double) Character.digit(array[1], 10);
            case '*':
                return (double) Character.digit(array[0], 10) * (double) Character.digit(array[1], 10);
            case '/':
                return (double) Character.digit(array[0], 10) / (double) Character.digit(array[1], 10);
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(evaluate("5 1 +"));
    }
}


