import java.util.List;

public class TypeOfTriangle {
    public static String type(List<Double> arrayList) {
        String triangle = "";

        double a = arrayList.get(0);
        double b = arrayList.get(1);
        double c = arrayList.get(2);

        if (!(a < b + c) || !(b < a + c) || !(c < a + b)) {
            return "Impossible";
        }

        if (isRectangular(a, b, c)) {
            return "Rectangular";
        }

        if (isAcute(a, b, c)) {
            return "Acute";
        }

        return "Obtuse";
    }

    private static boolean isRectangular(double a, double b, double c) {
        return (a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b);
    }

    private static boolean isAcute(double a, double b, double c) {
        return (a * a < b * b + c * c) && (b * b < a * a + c * c) && (c * c < a * a + b * b);
    }
}
