package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String name;

    public Cli(String name) {
        this.name = name;
    }
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

}