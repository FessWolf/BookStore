/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


/**
 *
 * @author Fess
 */
@Entity
@Table(name = "Book")
public class TestBook {
  @Id
  @Column(name= "book_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long book_id;
  
  @Column(name = "title", length = 64)
  private String title;
  
  @Column(name = "description", length = 255)
  private String description;
  
  /*@Column(name = "Genres", length = 255)
  private ArrayList<String> ListOfGenres = new ArrayList<>();
  
  @Column(name = "Authors", length = 255)
  pr-ivate ArrayList<String> ListOfAuthors = new ArrayList<>();*/
  
  @Column(name = "price", length = 32)  
  private Float price;

  public void setBookId(Long book_id){
      this.book_id = book_id;
  }
  public Long getBookId(){
      return book_id;
  }
  public void setTitle(String title){
      this.title = title;
  }
  public String getTitle(){
      return title;
  }
  public void setDescription(String description){
      this.description = description;
  }
  public String getDescription(){
      return description;
  }
  /*public void setListOfGenres(ArrayList<String> ListOfGenres){
      this.ListOfGenres = ListOfGenres;
  }
  public ArrayList<String> getListOfGenres(){
      return ListOfGenres;
  }
  public void setListOfAuthors(ArrayList<String> ListOfAuthors){
      this.ListOfAuthors = ListOfAuthors;
  }
  public ArrayList<String> getListOfAuthors(){
      return ListOfAuthors;
  }*/
  public void setPrice(float price){
      this.price = price;
  }
  public float getPrice(){
      return price;
  }
    
    
}
