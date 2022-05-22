package hexlet.code;

public class Utils {
    public static int getRandomNumber(int minValue, int maxValue) {
        return (minValue + (int) (Math.random() * maxValue));
    }
}
