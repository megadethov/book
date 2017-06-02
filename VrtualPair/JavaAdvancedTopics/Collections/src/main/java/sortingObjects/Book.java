package sortingObjects;

public class Book implements Comparable<Book> {

    private int id;
    private String title;
    private String author;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + " by " + author;
    }

    @Override
    public int compareTo(Book o) {
//        return -(this.id - o.id);
//        return this.title.compareTo(o.title);

        int result = this.title.compareTo(o.title);
        if (result == 0) {
            return this.author.compareTo(o.author);
        } else {
            return result;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        return author != null ? author.equals(book.author) : book.author == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}
