public class Book {

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


