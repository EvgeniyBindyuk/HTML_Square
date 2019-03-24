import java.util.Arrays;

class ColorOffset {

    private ColorList list = new ColorList();

    String[] getArrayWithOffset(int offset, int SquaresInRow) {
        if (offset >= ColorList.list.size()) {
            offset = offset % ColorList.list.size();
        }
        if (offset > 0 && offset < SquaresInRow) {
            String[] colors = list.getColorsInRow(SquaresInRow);
            String[] partOne = Arrays.copyOfRange(colors, 0, offset);
            String[] partTwo = Arrays.copyOfRange(colors, offset, colors.length);
            String[] finalColorsArray = new String[partOne.length + partTwo.length];
            System.arraycopy(partTwo, 0, finalColorsArray, 0, partTwo.length);
            System.arraycopy(partOne, 0, finalColorsArray, partTwo.length, partOne.length);
            return finalColorsArray;
        } else return list.getColorsInRow(SquaresInRow);
    }

}
