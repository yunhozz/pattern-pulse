package builder;

public abstract class Builder {

    protected abstract void makeTitle(String title);
    protected abstract void makeString(String str);
    protected abstract void makeItems(String[] items);
    protected abstract void close();
}
