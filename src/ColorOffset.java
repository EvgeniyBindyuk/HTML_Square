

import java.util.Arrays;

 class ColorOffset {

    private ColorList list = new ColorList();

    String[] getArrayWithOffset(int offset, int td) {
        int offsetReal = offset;
        if (offset > ColorList.list.size()) {
            offsetReal = offset % ColorList.list.size();
        }
        if (offset > 0) {
            String[] colors = list.getColors(td);
            String[] strings = Arrays.copyOfRange(colors, 0, offsetReal);
            String[] strings1 = Arrays.copyOfRange(colors, offsetReal, colors.length);
            String[] finalArray = new String[strings.length + strings1.length];
            System.arraycopy(strings1, 0, finalArray, 0, strings1.length);
            System.arraycopy(strings, 0, finalArray, strings1.length, strings.length);
            return finalArray;
        } else return list.getColors(td);
    }

}
