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