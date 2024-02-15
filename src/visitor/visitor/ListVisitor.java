package visitor.visitor;

import visitor.element.Directory;
import visitor.element.Entry;
import visitor.element.File;

import java.util.Iterator;

public class ListVisitor extends Visitor {

    private String currentDir = ""; // 현재 주목하고 있는 디렉토리 이름 저장하는 필드

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String savedir = currentDir;

        currentDir = currentDir + "/" + directory.getName();
        Iterator it = directory.iterator();

        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
        currentDir = savedir;
    }

    public String getCurrentDir() {
        return currentDir;
    }
}
