package BookType;

import BookPrice.BookPrice;
import BookPrice.MediumPriceBook;
import Vistors.Visitor;

public class ComicBook extends BookType {


    public ComicBook(){
        super(new MediumPriceBook());
        System.out.println("Creating ComicBook with price :" + bookPrice.getPrice());
    }

    public ComicBook(BookPrice bookPrice){
        super(bookPrice);
        System.out.println("Creating ComicBook with price :" + bookPrice.getPrice());

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return bookPrice.getPrice();
    }

}
