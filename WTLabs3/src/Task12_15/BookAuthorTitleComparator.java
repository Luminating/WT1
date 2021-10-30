package Task12_15;

import java.util.Comparator;

public class BookAuthorTitleComparator implements Comparator<Book> {

    public int compare(Book book, Book t1) {
        Comparator<Book> comparator = new BookAuthorComparator().thenComparing(new BookTitleComparator());
        return comparator.compare(book, t1);
    }
}
