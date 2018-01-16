import BookPrice.HighPriceBook;
import BookPrice.LowPriceBook;
import BookPrice.MediumPriceBook;
import BookType.AdventureBook;
import BookType.BookType;
import BookType.ComicBook;
import BookType.NovelBook;
import Vistors.PriceWithVatInGreeceVisitor;
import Vistors.PriceWithVatInItalyVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<BookType> bookTypeList = new ArrayList<BookType>();

        bookTypeList.add(new ComicBook());
        bookTypeList.add(new ComicBook(new HighPriceBook()));
        bookTypeList.add(new NovelBook());
        bookTypeList.add(new NovelBook(new MediumPriceBook()));
        bookTypeList.add(new AdventureBook());
        bookTypeList.add(new AdventureBook(new LowPriceBook()));

        PriceWithVatInGreeceVisitor priceWithVatInGreeceVisitor = new PriceWithVatInGreeceVisitor();
        PriceWithVatInItalyVisitor priceWithVatInItalyVisitor = new PriceWithVatInItalyVisitor();


        for(BookType bookType : bookTypeList) {
            bookType.accept(priceWithVatInGreeceVisitor);
            bookType.accept(priceWithVatInItalyVisitor);
        }

        System.out.println("Total Price incl VAT in Greece is : " + priceWithVatInGreeceVisitor.getTotalValueOfOrder());
        System.out.println("Total Price incl VAT in Italy is : " + priceWithVatInItalyVisitor.getTotalValueOfOrder());

    }
}
