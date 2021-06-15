import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Hello there");
        List<Double> sides = ConsoleReader.readLines();
        boolean isPositive = Validator.validateIsPositive(sides);
        if (isPositive != true) {
            System.out.println("Числа невалидные. Ошибка! Ошибка! Ошибка!");
            return;
        }
        System.out.println("Результат: " + TypeOfTriangle.type(sides));
    }
}
