package BookType;

import BookPrice.BookPrice;
import BookPrice.HighPriceBook;
import Vistors.Visitor;

public class AdventureBook extends BookType {

    public AdventureBook(){
        super(new HighPriceBook());
        System.out.println("Creating AdventureBook with price :" + bookPrice.getPrice());
    }

    public AdventureBook(BookPrice bookPrice){
        super(bookPrice);
        System.out.println("Creating AdventureBook with price :" + bookPrice.getPrice());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return bookPrice.getPrice();
    }

}
