import java.io.PrintWriter;

class HtmlCreator {

    private void printTable(PrintWriter writer, int countSquares, int pixelSize) {
        int squaresInRow;
        int rowCounter;
        ColorOffset offset = new ColorOffset();
        writer.println("</head>\n<body>\n<table>\n");

        if (1000 / pixelSize < countSquares) {
            squaresInRow = 1000 / pixelSize;
            if (countSquares % squaresInRow > 0) {
                rowCounter = (countSquares / squaresInRow) + 1;
            } else {
                rowCounter = countSquares / squaresInRow;
            }
        } else {
            squaresInRow = countSquares;
            rowCounter = 1;
        }
        String[] colors;
        for (int i = 0; i < rowCounter; i++) {
            writer.println("<tr>");
            for (int j = 0; j < squaresInRow; j++) {
                if (i <= squaresInRow) {
                    colors = offset.getArrayWithOffset(i, squaresInRow);
                } else colors = offset.getArrayWithOffset(j, squaresInRow);
                writer.println("<td bgcolor=\"" + colors[j] + "\"></td>");
            }
            writer.println("</tr>");
        }
        writer.println("</table>");

    }

    private void printStyle(PrintWriter writer, int pixelSize) {
        writer.println("<style>\ntd {\nwidth: " + pixelSize + "px;\nheight: "
                + pixelSize + "px;\n}\n</style>");
    }

    private void printHead(PrintWriter writer) {
        writer.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<title>Title</title>");
    }

    private void printEnd(PrintWriter writer) {
        writer.println("</body>\n</html>");
    }

    void printHtml(PrintWriter writer, int pixelSize, int countSquares) {
        printHead(writer);
        printStyle(writer, pixelSize);
        printTable(writer, countSquares, pixelSize);
        printEnd(writer);
    }
}
