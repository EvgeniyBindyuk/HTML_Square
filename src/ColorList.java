
import java.util.ArrayList;

class ColorList {

    static ArrayList<String> list = new ArrayList<>();

    String[] getColorsInRow(int td) {
        String[] colors = new String[td];
        int oneColorSquares;
        int remaindColors;
        if (td > list.size()) {
            remaindColors = td % list.size();
            oneColorSquares = (int) Math.round((double) td / list.size());
            int remaindCounter = 0;
            int oneColorCounter = 0;
            boolean flag = false;
            for (int i = 0; i < colors.length; i++) {
                colors[i] = list.get(remaindCounter);
                oneColorCounter++;
                if (oneColorCounter == oneColorSquares && remaindCounter <= 18) {
                    if ((double) i % 2 == 0 && i != 0 && !flag) {
                        flag = true;
                        oneColorCounter = oneColorSquares - 1;
                    } else {
                        oneColorCounter = 0;
                    }
                    if (remaindColors > 0 && flag) {
                        flag = false;
                        remaindColors--;
                    } else {
                        remaindCounter++;
                    }
                }
            }
        } else {
            oneColorSquares = (int) Math.floor((double) list.size() / td);
            int a = 0;
            for (int i = 0; i < colors.length; i++) {
                colors[i] = list.get(a);
                a += oneColorSquares;
            }
        }
        return colors;
    }

    static {
        Colors colors = new Colors();
        list.add(colors.RED1);
        list.add(colors.RED2);
        list.add(colors.RED3);

        list.add(colors.ORANGE1);
        list.add(colors.ORANGE2);
        list.add(colors.ORANGE3);

        list.add(colors.YELLOW1);
        list.add(colors.YELLOW2);
        list.add(colors.YELLOW3);

        list.add(colors.GREEN1);
        list.add(colors.GREEN2);
        list.add(colors.GREEN3);

        list.add(colors.BLUE1);
        list.add(colors.BLUE2);
        list.add(colors.BLUE3);

        list.add(colors.PURPLE1);
        list.add(colors.PURPLE2);
        list.add(colors.PURPLE3);
    }
}
