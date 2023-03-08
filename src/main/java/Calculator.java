import java.util.Scanner;

public class Calculator {

    public void product(int numberOfPersons) {
        double sum = 0;
        double productPrice;
        String productName;
        String productsList = "Список товаров :";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Чтобы завершить добовление товаров на пишите Заверишть\nВведите название товара :");
            productName = scanner.next();
            if (productName.equalsIgnoreCase("Завершить")) {
                break;
            }
            System.out.println("Введите стоиомсть товара :");
            if (!scanner.hasNextDouble()) {
                System.out.println("Необходимо ввести стоимость товара");
                scanner.next();
            } else {
                productPrice = scanner.nextDouble();
                if (productPrice < 0) {
                    System.out.println("Введите положительное число");
                } else {
                    productsList += "\n" + productName + " стоимостью " + productPrice + "р";
                    System.out.println(productsList);
                    sum += productPrice;
                    System.out.println("Товар успешно добавлен");
                }
            }
        }

        System.out.println("Общая сумма товаров = " + sum);
        sum /= numberOfPersons;
        Formatter formatter = new Formatter();
        formatter.reform(sum);
    }
}
