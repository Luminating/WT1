package Task12_15;

import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {

    public int compare(Book book, Book t1) {
        Comparator<Book> comparator = new BookTitleComparator().thenComparing(new BookAuthorComparator());
        return comparator.compare(book, t1);
    }
}
