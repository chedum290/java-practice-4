import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        class Book {
            public void setRead(boolean read) {
                isRead = read;
            }

            public boolean isRead() {
                return isRead;
            }

            public int getPages() {
                return pages;
            }

            public String getAuthor() {
                return author;
            }

            public String getTitle() {
                return title;
            }

            public String describe() {
                return "Книга: " + getTitle() +
                        " автор " + getAuthor() +
                        ", " + getPages() +
                        " стр., прочитана: " + isRead();
            }


            private String title;
            private String author;
            private int pages;
            private boolean isRead;

            public Book(String title, String author, int pages, boolean isRead) {
                this.title = title;
                this.author = author;
                this.pages = pages;
                this.isRead = isRead;

            }
        }
        class Reader {
            String name;
            String favouriteGenre;
            Book lastBook;

            public void readBook(Book book) {
                lastBook = book;
                book.setRead(true);
            }

            public String getLastBookInfo() {
                if (lastBook != null) {
                    return lastBook.describe();
                } else {
                    return "Пока ничего не читал";
                }
            }


            public Reader(String name, String favouriteGenre, Book lastBook) {
                this.name = name;
                this.favouriteGenre = favouriteGenre;
                this.lastBook = lastBook;
            }
        }
        class Library {
            private List<Book> books = new ArrayList<>();

            public void addBook(Book book) {
                books.add(book);
            }

            public List<Book> findByAuthor(String author) {
                List<Book> result = new ArrayList<>();

                for (Book book : books) {
                    if (book.getAuthor().equals(author)) {
                        result.add(book);
                    }
                }

                return result;
            }

            public int getTotalPages() {
                int totalPages = 0;
                for (Book book : books) {
                    totalPages += book.getPages();
                }
                return totalPages;
            }

            public List<Book> getUnreadBooks() {
                List<Book> result = new ArrayList<>();
                for (Book book : books) {
                    if (!book.isRead()) {
                        result.add(book);
                    }
                }
                return result;

            }
        }


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