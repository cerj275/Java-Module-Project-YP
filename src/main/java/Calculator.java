import java.util.Scanner;

public class Calculator {

    public void product(int numberOfPersons) {                                    // Метод для добавления товара и цены
        double sum = 0;
        double productPrice;
        String productName;
        StringBuilder productsList = new StringBuilder("Список товаров :");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Чтобы завершить добавление товаров на пишите Завершить\nВведите название товара :");
            productName = scanner.next();
            if (productName.equalsIgnoreCase("Завершить")) {          // Для того, что бы завершить добавление товаров необходимо написать "Завершить"
                break;
            }
            System.out.println("Введите стоимость товара :");
            if (!scanner.hasNextDouble()) {
                System.out.println("Необходимо ввести стоимость товара");
                scanner.next();
            } else {
                productPrice = scanner.nextDouble();
                if (productPrice < 0) {
                    System.out.println("Введите положительное число");
                } else {
                    productsList.append("\n").append(productName).append(" стоимостью ").append(productPrice).append("р");
                    System.out.println(productsList);
                    sum += productPrice;
                    System.out.println("Товар успешно добавлен");
                }
            }
        }

        System.out.println("Общая сумма товаров = " + sum);
        sum /= numberOfPersons;
        Formatter formatter = new Formatter();
        formatter.reform(sum);                                                // Вызываем метод, который склоняет падеж
    }
}
