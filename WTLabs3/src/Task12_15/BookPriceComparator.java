package Task12_15;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {

    public int compare(Book book, Book t1) {
        return book.getPrice() - t1.getPrice();
    }
}
