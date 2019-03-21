import java.io.PrintWriter;

public class BlockCreator {


    void createTable(PrintWriter writer, int countSquares, int pixelSize) {
        writer.println("<table>\n");

        int td;
        int tr;

        if (1000 / pixelSize < countSquares) {
            td = 1000 / pixelSize;
            if (countSquares % td > 0) {
                tr = (countSquares / td) + 1;
            } else {
                tr = countSquares / td;
            }
        } else {
            td = countSquares;
            tr = 1;
        }
        for (int i = 0; i < tr; i++) {
            writer.println("<tr>\n");
            for (int j = 0; j < td; j++) {
                writer.println("<td></td>\n");
            }
            writer.println("/tr>\n");
        }


    }

    void createStyle(PrintWriter writer, int pixelSize) {
        writer.println("<style>\ntd {\nwidth: " + pixelSize + "px;\nheight: "
                + pixelSize + "px;\n</style>");
    }
}
