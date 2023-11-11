package library.hw_library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {
    Library library;
    Book[] books;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(5);
        books = new Book[4];
        books[0] = new Book(101L, "Author1", "Book1", 2000);
        books[1] = new Book(102L, "Author1", "Book2", 2001);
        books[2] = new Book(103L, "Author2", "Book3", 2002);
        books[3] = new Book(104L, "Author3", "Book4", 2003);

    }

    @Test
    void addBook() {
        assertTrue(library.addBook(books[0])); // Добавляем книгу
        assertEquals(1, library.quantity()); // Проверяем, что количество книг в библиотеке стало 1
        assertFalse(library.addBook(books[0])); // Нельзя добавить ту же книгу с тем же ISBN
        assertEquals(1, library.quantity()); // Проверяем, что количество книг не изменилось
        assertTrue(library.addBook(books[1])); // Добавляем другую книгу с уникальным ISBN
        assertEquals(2, library.quantity()); // Проверяем, что количество

    }

    @Test
    void removeBook() {
        library.addBook(books[0]); // Добавляем книгу
        assertNotNull(library.removeBook(101L)); // Удаляем книгу по ISBN
        assertNull(library.removeBook(101L)); // Пытаемся удалить уже удаленную книгу
        assertEquals(0, library.quantity()); // Проверяем, что количество книг
    }

    @Test
    void findBook() {
        library.addBook(books[0]); // Добавляем книгу
        assertNotNull(library.findBook(101L)); // Ищем книгу по ISBN
        assertNull(library.findBook(105L)); // Пытаемся найти несуществующую книгу
    }


    @Test
    void quantity() {
        assertEquals(0, library.quantity()); // Проверяем, что изначально библиотека пуста
        library.addBook(books[0]); // Добавляем книгу
        assertEquals(1, library.quantity()); // Проверяем, что количество книг стало 1
        library.removeBook(101L); // Удаляем книгу
        assertEquals(0, library.quantity()); // Проверяем, что количество книг стало 0 после удаления
    }


    @Test
    void printBook() {
        library.printBook();
    }
    @Test
    void testFindBooksByAuthor() {
        library.addBook(books[0]); // Добавляем книгу
        library.addBook(books[1]); // Добавляем еще одну книгу того же автора
        library.addBook(books[2]); // Добавляем книгу другого автора

        Book[] booksByAuthor1 = library.findBooksAuthor("Author1");
        assertEquals(2, booksByAuthor1.length); // Проверяем, что найдено 2 книги автора "Author1"
        assertEquals("Book1", booksByAuthor1[0].getTitle()); // Проверяем название первой книги
        assertEquals("Book2", booksByAuthor1[1].getTitle()); // Проверяем название второй книги

        Book[] booksByAuthor2 = library.findBooksAuthor("Author2");
        assertEquals(1, booksByAuthor2.length); // Проверяем, что найдена 1 книга автора "Author2"
        assertEquals("Book3", booksByAuthor2[0].getTitle()); // Проверяем название книги автора "Author2"
    }
}