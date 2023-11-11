package library.hw_library;

public class LibraryAppl {
    public static void main(String[] args) {
        Library library = new LibraryImpl(4);


        library.addBook(new Book(101L, "Author1", "Book1", 2000));
        library.addBook(new Book(102L, "Author2", "Book2", 2001));
        library.addBook(new Book(103L, "Author3", "Book3", 2002));
        library.addBook(new Book(104L, "Author4", "Book4", 2003));

        Book bookToFind = library.findBook(102L);
        if (bookToFind != null) {
            System.out.println("Найденная книга: " + bookToFind);
        } else {
            System.out.println("Книга с указанным ISBN не найдена в библиотеке.");
        }

        Book[] booksByAuthor = library.findBooksAuthor("Author1");
        if (booksByAuthor.length > 0) {
            System.out.println("Найденные книги автора Author1:");
            for (Book book : booksByAuthor) {
                System.out.println(book);
            }
        } else {
            System.out.println("Книги данного автора не найдены в библиотеке.");
        }
    }
}
