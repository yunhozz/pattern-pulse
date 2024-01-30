package composite;

public abstract class Entry {

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException(entry.getName() + "을 추가하는데 문제가 발생했습니다.");
    }

    public void printList() {
        printList("");
    }

    public abstract String getName();
    public abstract int getSize();
    public abstract void printList(String prefix);
}
