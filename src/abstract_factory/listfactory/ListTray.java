package abstract_factory.listfactory;

import abstract_factory.factory.Item;
import abstract_factory.factory.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>\n");
        sb.append(caption).append("\n");
        sb.append("<ul>\n");

        for (Item o : tray) {
            sb.append(o.makeHTML());
        }

        sb.append("</ul>\n");
        sb.append("</li>\n");

        return sb.toString();
    }
}
