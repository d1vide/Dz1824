package homework1.practice19.number1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int currentInn = 12345;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер ИНН");
            try {
                int inn = sc.nextInt();
                checkInn(inn, currentInn);
                break;
            } catch (WrongINNException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("ИНН действителен!");
    }

    public static boolean checkInn(int inn, int currentInn) throws WrongINNException {
        if (currentInn == inn) {
            return true;
        }
        else {
            throw new WrongINNException(inn);
        }


    }
}
