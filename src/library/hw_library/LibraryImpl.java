package library.hw_library;

public class LibraryImpl implements Library {


    public LibraryImpl(int i) {

    }

    @Override
    public boolean addBook(Book book) {
        return false;
    }

    @Override
    public Book removeBook(long isbn) {
        return null;
    }

    @Override
    public Book findBook(long isbn) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public void printBook() {

    }

    @Override
    public Book[] findBooksAuthor(String author) {
        return new Book[0];
    }
}

