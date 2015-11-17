package kz.kazntu.lessons.main;


import kz.kazntu.lessons.models.Book;
import kz.kazntu.lessons.models.Lang;
import kz.kazntu.lessons.utils.SessionFactor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Lang lang1 = new Lang("Java") ;
        Lang lang2 = new Lang("Python") ;

        Book book1 = new Book("Как программировать на Java", "Дейтел Х.", "123-12", lang1) ;
        Book book2 = new Book("Изучаем Python", "Лутц М.", "123-15", lang2) ;
        Book book3 = new Book("Программируем на Python", "Лутц М.", "124-13", lang2) ;
        Book book4 = new Book("Философия Java", "Брюс Э.", "125-18", lang1) ;

        Set<Book> javaBooks = new HashSet<Book>() ;
        javaBooks.add(book1) ;
        javaBooks.add(book4) ;
        lang1.setBooks(javaBooks);

        Set<Book> pythonBooks = new HashSet<Book>() ;
        pythonBooks.add(book2) ;
        pythonBooks.add(book3) ;
        lang2.setBooks(pythonBooks) ;

        SessionFactory sessionFactory = SessionFactor.getSessionFactory() ;
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;

        session.save(lang1) ;
        session.save(lang2) ;

        session.getTransaction().commit();
        session.close() ;

    }
}
