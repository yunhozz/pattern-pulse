package decorator.border;

import decorator.display.Display;

public class SideBorder extends Border {

    private final char c;

    public SideBorder(Display display, char c) {
        super(display);
        this.c = c;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return c + display.getRowText(row) + c;
    }

    public char getChar() {
        return c;
    }
}
