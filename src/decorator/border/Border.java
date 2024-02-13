package decorator.border;

import decorator.display.Display;

public abstract class Border extends Display {

    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
