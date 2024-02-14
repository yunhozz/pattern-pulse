package visitor.visitor;

import visitor.element.Directory;
import visitor.element.File;

public class ListVisitor extends Visitor {

    private final String currentDir = ""; // 현재 주목하고 있는 디렉토리 이름 저장하는 필드

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {

    }

    public String getCurrentDir() {
        return currentDir;
    }
}
