package kz.kazntu.lessons.models;


import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    private long id ;
    private String title ;
    private String author ;
    private String isbn ;

    private Lang lang ;

    public Book(){

    }

    public Book(String title, String author, String isbn, Lang lang) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.lang = lang;
    }

    public Book(String title, String author, String isbn) {

        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name = "isbn")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @ManyToOne
    @JoinColumn(name = "lang_id")
    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }
}
