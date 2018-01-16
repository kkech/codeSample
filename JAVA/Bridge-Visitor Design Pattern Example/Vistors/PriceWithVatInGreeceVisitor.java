package Vistors;

import BookType.ComicBook;
import BookType.AdventureBook;
import BookType.NovelBook;

public class PriceWithVatInGreeceVisitor implements Visitor {

    private double totalValueOfOrder = 0.0;

    @Override
    public void visit(ComicBook comicBook) {
        if(comicBook.getPrice() < 20)
            totalValueOfOrder = totalValueOfOrder + comicBook.getPrice();
        else
            totalValueOfOrder = totalValueOfOrder + comicBook.getPrice() + comicBook.getPrice() * 0.1d;
    }

    @Override
    public void visit(AdventureBook adventureBook) {
        if(adventureBook.getPrice() < 25)
            totalValueOfOrder = totalValueOfOrder + adventureBook.getPrice();
        else
            totalValueOfOrder = totalValueOfOrder + adventureBook.getPrice() + adventureBook.getPrice() * 0.12d;


    }

    @Override
    public void visit(NovelBook novelBook) {
        if(novelBook.getPrice() < 30)
            totalValueOfOrder = totalValueOfOrder + novelBook.getPrice();
        else
            totalValueOfOrder = totalValueOfOrder + novelBook.getPrice() + novelBook.getPrice() * 0.18d;
    }

    public double getTotalValueOfOrder() {
        return totalValueOfOrder;
    }
}
