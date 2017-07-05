/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Classes.Author;
import Classes.Books;
import Util.HibernateUtil;
import java.math.BigDecimal;
import org.hibernate.Session;

/**
 *
 * @author Fess
 */
public class TestAddBook {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Author author1 = new Author();
        author1.setAuthorId(new Long(1));
        author1.setAuthorName("J.R.R Tolkien");
        session.save(author1);
        Books book1 = new Books();
        //book1.setBookId(new Long(1));
        book1.setDescription("Hobbits are going to destroy the One Ring");
        book1.setTitle("Lord of the rings");
        book1.setPrice(new BigDecimal(150.20));
        //book1.setAuthorsList(Arrays.asList(author1));
        session.save(book1);
        session.getTransaction().commit();
        session.close();
    }
}