package visitor.element;

import visitor.visitor.Visitor;

public interface Element {
    void accept(Visitor v);
}
