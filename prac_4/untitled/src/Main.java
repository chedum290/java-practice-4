import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {




        Book book1 = new Book("Война и мир", "Лев Толстой", 1225, false);
        Book book2 = new Book("Гарри Поттер", "Джоан Роулинг", 500, false);
        Book book3 = new Book("Преступление и наказание", "Федор Достоевский", 671, false);
        Book book4 = new Book("Анна Каренина", "Лев Толстой", 864, false);
        Book book5 = new Book("Идиот", "Федор Достоевский", 640, true);
        System.out.println(book1.describe());
        System.out.println(book2.describe());
        System.out.println(book3.describe());
        Reader reader1 = new Reader("Анна", "Фантастика", null);
        Reader reader2 = new Reader("Иван", "Классика", null);
        reader1.readBook(book1);
        reader2.readBook(book2);
        System.out.println(reader1.getLastBookInfo());
        System.out.println(reader2.getLastBookInfo());
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        System.out.println(library.getTotalPages());
        for (Book book : library.findByAuthor("Лев Толстой")) {
            System.out.println(book.getTitle());
        }
        for (Book book : library.getUnreadBooks()) {
            System.out.println(book.getTitle());


        }

    }
}