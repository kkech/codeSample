package Visitable;

import Vistors.Visitor;

public interface Visitable {
    public void accept(Visitor visitor);
}
