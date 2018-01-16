package Vistors;

import BookType.AdventureBook;
import BookType.ComicBook;
import BookType.NovelBook;

public class PriceWithVatInItalyVisitor implements Visitor {

    private double totalValueOfOrder = 0.0;

    @Override
    public void visit(ComicBook comicBook) {
        if(comicBook.getPrice() <15)
            totalValueOfOrder = totalValueOfOrder + comicBook.getPrice();
        else
            totalValueOfOrder = totalValueOfOrder + comicBook.getPrice() + comicBook.getPrice() * 0.07d;
    }

    @Override
    public void visit(AdventureBook adventureBook) {
        if(adventureBook.getPrice() < 20)
            totalValueOfOrder = totalValueOfOrder + adventureBook.getPrice();
        else
            totalValueOfOrder = totalValueOfOrder + adventureBook.getPrice() + adventureBook.getPrice() * 0.1d;


    }

    @Override
    public void visit(NovelBook novelBook) {
        if(novelBook.getPrice() < 10)
            totalValueOfOrder = totalValueOfOrder + novelBook.getPrice();
        else
            totalValueOfOrder = totalValueOfOrder + novelBook.getPrice() + novelBook.getPrice() * 0.12d;
    }

    public double getTotalValueOfOrder() {
        return totalValueOfOrder;
    }
}
