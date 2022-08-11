public class Book {
    private final String bookName;
    private final Author author;
    private int yearOfCreate;

    public Book(String bookName, Author author, int yearOfCreate) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfCreate = yearOfCreate;
    }

    public String getBookName() {
        return bookName;
    }
    
    public Author getAuthor() {
        return author;
    }

    public int getYearOfCreate() {
        return yearOfCreate;
    }

    public void setYearOfCreate(int yearOfCreate) {
        this.yearOfCreate = yearOfCreate;
    }
}
