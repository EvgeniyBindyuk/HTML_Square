
import java.util.ArrayList;

class ColorList {
    static ArrayList<String> list = new ArrayList<>(22);

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
        list.add(colors.GREEN4);

        list.add(colors.BLUE1);
        list.add(colors.BLUE2);
        list.add(colors.BLUE3);
        list.add(colors.BLUE4);

        list.add(colors.PURPLE1);
        list.add(colors.PURPLE2);
        list.add(colors.PURPLE3);
        list.add(colors.PURPLE4);
        list.add(colors.PURPLE5);
    }
}
