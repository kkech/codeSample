package BookType;

import BookPrice.BookPrice;
import Visitable.Visitable;
import Vistors.Visitor;

public abstract class BookType implements Visitable {
    protected BookPrice bookPrice;

    public BookType(BookPrice bookPrice){
        this.bookPrice = bookPrice;
    }

    public BookPrice getBookPrice() {
        return bookPrice;
    }

    abstract public void accept(Visitor visitor);

}
