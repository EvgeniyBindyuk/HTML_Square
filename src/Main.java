import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/Square.html";
        File file = new File(path);
        Scanner scanner = new Scanner(System.in);
        HtmlCreator creator = new HtmlCreator();

        System.out.println("Введите размер квадрата:");
        int size = scanner.nextInt();
        System.out.println("Введите количество квадратов:");
        int count = scanner.nextInt();

        try (PrintWriter writer = new PrintWriter(file)) {
            creator.printHtml(writer, size, count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

