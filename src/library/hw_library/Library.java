package library.hw_library;

public interface Library {
    boolean addBook(Book book);
    Book removeBook(long isbn);
    Book findBook(long isbn);
    int quantity();
    void printBook();

    //Book - Library, найти несколько книг по автору
    Book[] findBooksAuthor(String author);
}
