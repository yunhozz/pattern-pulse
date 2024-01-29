package abstract_factory.listfactory;

import abstract_factory.factory.Item;
import abstract_factory.factory.Page;

public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><title>").append(title).append("</title></head>\n");
        sb.append("<body>\n");
        sb.append("<h1>").append(title).append("</h1>\n");
        sb.append("<ul>\n");

        for (Item o : content) {
            sb.append(o.makeHTML());
        }

        sb.append("</ul>\n");
        sb.append("<hr><address>").append(author).append("</address>");
        sb.append("</body></html>\n");

        return sb.toString();
    }
}
