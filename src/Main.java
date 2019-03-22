import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BlockCreator creator = new BlockCreator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер квадрата:");
        int size = scanner.nextInt();
        System.out.println("Введите количество квадратов:");
        int count = scanner.nextInt();
        String path = System.getProperty("user.dir") + "/src/Square.html";
        File file = new File(path);
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             PrintWriter writer = new PrintWriter(file)) {
            writer.println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>Title</title>\n");

            creator.createStyle(writer, size);
            writer.println("</head>\n" +
                    "<body>\n");
            creator.createTable(writer, count, size);
            writer.println("</body>\n" +
                    "</html>");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}

