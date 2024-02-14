package visitor.element;

import visitor.visitor.Visitor;

public class File extends Entry {

    private String name;
    private int size;

    private File() {}

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }
}
