import java.util.List;

public class Validator {

    public static boolean validateIsPositive(List<Double> arrayList) {
        for (double i : arrayList) {
            if (i <= 0) {
                throw new InvalidTriangleException("Такое здесь не пройдет");
            }
        }
        return true;
    }
}
