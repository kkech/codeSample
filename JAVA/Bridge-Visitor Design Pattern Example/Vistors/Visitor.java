package Vistors;


import BookType.ComicBook;
import BookType.AdventureBook;
import BookType.NovelBook;

public interface Visitor {
    public void visit(ComicBook comicBook);
    public void visit(AdventureBook adventureBook);
    public void visit(NovelBook novelBook);
}
