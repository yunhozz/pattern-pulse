package composite.entry;

import composite.Entry;
import composite.FileTreatmentException;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

    private String name;
    private final List<Entry> entries = new ArrayList<>();

    private Directory() {}

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public Entry add(Entry entry) {
        entries.add(entry);
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry e : entries) {
            size += e.getSize();
        }
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry e : entries) {
            e.printList(prefix + "/" + name);
        }
    }
}
