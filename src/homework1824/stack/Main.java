package homework1824.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String expr = "1 2 + 3 5 - 5 * -";
        String[] strings = expr.split(" ");
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < strings.length; i++) {
            if (isNumber(strings[i])) {
                stack.push(Double.parseDouble(strings[i]));
            }
            else {
                double tmp1 = stack.pop();
                double tmp2 = stack.pop();

                switch (strings[i]) {
                    case "+":
                        stack.push(tmp2+tmp1);
                        break;
                    case "-":
                        stack.push(tmp2-tmp1);
                        break;
                    case "*":
                        stack.push(tmp2*tmp1);
                        break;
                    case "/":
                        stack.push(tmp2/tmp1);
                        break;
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
