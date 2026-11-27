import java.util.ArrayList;
import java.util.List;

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