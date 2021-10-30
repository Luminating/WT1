package Task12_15;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {

    public int compare(Book book, Book t1) {
        return book.getTitle().compareTo(t1.getTitle());
    }
}
