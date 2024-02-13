package decorator.display;

public class StringDisplay extends Display {

    private String str;

    private StringDisplay() {}

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    public int getColumns() {
        return str.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        return (row == 0) ? str : null;
    }

    public String getStr() {
        return str;
    }
}
