public class Formatter {
    public void reform(double sum) {                                                       // Метод для скланения падежа

        String caseOfRub = "";
        double rem10 = sum % 10;
        double rem100 = sum % 100;
        int x = 0;

        if (Double.compare(rem100, 10) > x && Double.compare(rem100, 19) < x) {
            caseOfRub = "рублей";
        } else if (Double.compare(rem10, 2) >= x && Double.compare(rem10, 5) < x) {
            caseOfRub = "рубля";
        } else if (Double.compare(rem10, 1) == x) {
            caseOfRub = "рубль";
        } else {
            caseOfRub = "рублей";
        }
        result(sum, caseOfRub);
    }

    public void result(double sum, String caseOfRub) {                                   // Метод для вывода рассчета
        String result = String.format("%.2f", sum);
        System.out.println("Сумма с каждого  человека = " + result + " " + caseOfRub);
    }
}
