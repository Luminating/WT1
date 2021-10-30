package Task12_15;

import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {

    public int compare(Book book, Book t1) {
        return book.getAuthor().compareTo(t1.getAuthor());
    }
}
