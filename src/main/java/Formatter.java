public class Formatter {
    public void reform(double sum) {
        String caseOfRub = "";

        if (sum == 1 || sum % 10 == 1) {
            caseOfRub = "рубль";
        } else if (sum > 1 && sum < 5 || sum % 10 > 1 && sum % 10 < 5) {
            caseOfRub = "рубля";
        } else {
            caseOfRub = "рублей";
        }
        result(sum, caseOfRub);
    }

    public void result(double sum, String caseOfRub) {
        String result = String.format("%.2f", sum);
        System.out.println("Сумма с каждого  человека = " + result + " " + caseOfRub);
    }
}
