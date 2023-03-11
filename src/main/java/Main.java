import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На скольких человек необходимо разделить счет?");
        int numberOfPersons = 0;
        while (true) {                                                                   // Цикл для ввода кол-ва человек и вызов метода для расчета суммы на человека
            if (!scanner.hasNextInt()) {
                System.out.println("Необходимо ввести количество людей");
                scanner.next();
            } else {
                numberOfPersons = scanner.nextInt();
                if (numberOfPersons == 1) {
                    System.out.println("Ты платишь за все. Попробуй ещё раз:");
                } else if (numberOfPersons <= 0) {
                    System.out.println("Число должно быть положительным. Введите, пожалуйста, заново:");
                } else {
                    Calculator calculator = new Calculator();
                    calculator.product(numberOfPersons);
                    break;
                }
            }
        }
    }
}