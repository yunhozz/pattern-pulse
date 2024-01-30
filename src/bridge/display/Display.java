package bridge.display;

import bridge.RawDisplay;

public class Display {

    private RawDisplay rawDisplay; //브릿지 패턴의 다리 역할, 느슨한 위임

    private Display() {}

    public Display(RawDisplay rawDisplay) {
        this.rawDisplay = rawDisplay;
    }

    public void open() {
        rawDisplay.rawOpen();
    }

    public void print() {
        rawDisplay.rawPrint();
    }

    public void close() {
        rawDisplay.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
