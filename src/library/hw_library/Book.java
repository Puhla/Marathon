package library.hw_library;
/*
Task 1. Step 1 - repeat on your own all the steps that we did in the class using the example class Book and Library interface.

        create a Book class with the fields ISBN, author, book title, year of publication;
create a Library interface with methods:
        add a book;
        delete a book;
        find a book;
        number of books;
        print a list of books.
        create the class LibraryImpl, which implements Library
        create the LibraryImplTest class, in which we create tests for methods.

        создаем класс LibraryImpl, который implements Library;
создаем класс LibraryImplTest, в котором создаем тесты для вышеперечисленных методов.

*/

public class Book {
    private long isbn;
    private String author;
    private String title;
    private int yearOfPublishing;

    public Book(long isbn, String author, String title, int yearOfPublishing) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return (int) (isbn ^ (isbn >>> 32));
    }
}
