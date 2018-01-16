package BookType;

import BookPrice.BookPrice;
import BookPrice.LowPriceBook;
import Vistors.Visitor;

public class NovelBook extends BookType {


    public NovelBook(){
        super(new LowPriceBook());
        System.out.println("Creating NovelBook with price :" + bookPrice.getPrice());
    }

    public NovelBook(BookPrice bookPrice){
        super(bookPrice);
        System.out.println("Creating NovelBook with price :" + bookPrice.getPrice());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return bookPrice.getPrice();
    }

}
