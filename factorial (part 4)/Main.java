import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long amountOfFactorials;

        System.out.println("Введите количество факториалов:");
        try {
            amountOfFactorials = in.nextLong();

            if (amountOfFactorials < 0 || amountOfFactorials > Long.MAX_VALUE) {
                throw new IOException();
            }
        } catch (IOException e) {
            System.out.println("Данные неправильно введены.");
            throw new RuntimeException(e);
        }

        FactorialCalc factorialCalc = new FactorialCalc();
        factorialCalc.calculateFactorials(amountOfFactorials);

        System.out.println(factorialCalc.toString());
    }
}
