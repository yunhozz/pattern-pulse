package bridge.display;

import bridge.RawDisplay;

public class CountDisplay extends Display {

    public CountDisplay(RawDisplay rawDisplay) {
        super(rawDisplay);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
