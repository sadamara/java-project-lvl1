package hexlet.code;

public class Utils {
    public static int getRandomNumber(int minValue, int maxValue) {
        return (minValue + (int) (Math.random() * maxValue));
    }

    public static String getRandomOperator() {
        String[] operators = {"+", "-", "*"};
        final int max = 3;
        int i = (0 + (int) (Math.random() * max));
        return operators[i];
    }
}
