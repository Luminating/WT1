package Task12_15;

import java.util.Comparator;

public class BookAuthorTitlePriceComparator implements Comparator<Book> {

    public int compare(Book book, Book t1) {
        Comparator<Book> comparator = new BookAuthorComparator().thenComparing(new BookTitleComparator()).thenComparing(new BookPriceComparator());
        return comparator.compare(book, t1);
    }
}
