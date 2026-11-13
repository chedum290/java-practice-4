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
                } else

            {
                return "Пока ничего не читал";
            }
        }





            public Reader(String name, String favouriteGenre, Book lastBook) {
                this.name = name;
                this.favouriteGenre = favouriteGenre;
                this.lastBook = lastBook;
            }
        }

        Book book1 = new Book("Война и мир", "Лев толстой", 1225, false);
        Book book2 = new Book("Гарри Поттер", "Джоан Роулинг", 500, false);
        Book book3 = new Book("Преступление и наказание", "Федор Достоевский", 671, false);
        System.out.println(book1.describe());
        System.out.println(book2.describe());
        System.out.println(book3.describe());
        Reader reader1 = new Reader("Анна", "Фантастика", null);
        Reader reader2 = new Reader("Иван", "Классика", null);


    }

    }