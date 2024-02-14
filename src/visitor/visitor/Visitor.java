package visitor.visitor;

import visitor.element.Directory;
import visitor.element.File;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
