package Task12_15;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return price == book.price && title.equals(book.title) && author.equals(book.author);
    }

    public int hashCode() {
        return (title.hashCode() + author.hashCode()) / price;
    }

    public String toString() {
        return "title: " + title + "; author: " + author + "; price: " + price;
    }

    protected Book clone() throws CloneNotSupportedException {
        return (Book)super.clone();
    }

    public int compareTo(Book book) {
        return isbn - book.isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
