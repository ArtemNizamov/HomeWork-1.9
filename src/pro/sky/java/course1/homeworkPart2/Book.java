package pro.sky.java.course1.homeworkPart2;

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

    @Override
    public String toString() {
        return bookName + " " + yearOfCreate + " " + author;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book forest = (Book) other;
        return bookName.equals(forest.bookName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }

}
