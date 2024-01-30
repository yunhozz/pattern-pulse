package bridge.display;

import bridge.RawDisplay;

public class StringDisplay extends RawDisplay {

    private String str;
    private int width;

    private StringDisplay() {}

    public StringDisplay(String str) {
        this.str = str;
        width = str.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    public String getStr() {
        return str;
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
