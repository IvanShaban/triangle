import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class ConsoleReader {
    public static List<Double> readLines() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double b = 0;
        double c = 0;
        try {
            System.out.println("Введите данные");
            System.out.println("Введите сторону А");
            a = Double.parseDouble(reader.readLine());
            System.out.println("Введите сторону Б");
            b = Double.parseDouble(reader.readLine());
            System.out.println("Введите сторону В");
            c = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("В анус себе эти буквы засунь, псина");
        }
        return Arrays.asList(a, b, c);
    }
}
