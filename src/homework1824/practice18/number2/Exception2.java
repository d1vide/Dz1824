package homework1.practice18.number2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int");
        String intString = sc.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2/i);
        } catch (NumberFormatException e) {
            System.out.println("Wrong num");
        } catch (ArithmeticException e) {
            System.out.println(" / by null");
        } finally {
            System.out.println("Block finally");
        }

    }
}
