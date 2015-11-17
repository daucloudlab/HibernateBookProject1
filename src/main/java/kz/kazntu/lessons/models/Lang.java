package kz.kazntu.lessons.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "lang")
public class Lang {
    private int id ;
    private String name ;

    private Set<Book> books ;

    @OneToMany(mappedBy = "lang", cascade = CascadeType.ALL)
    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }



    public Lang(){

    }
    public Lang(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
