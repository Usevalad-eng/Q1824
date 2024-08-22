package classTasks.lessonSevenLibrarySystem;

public class Book {

    String  title;
    String author;
    int copies;

    public Book(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", copies=").append(copies);
        sb.append('}');
        return sb.toString();
    }


}
