/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.BookGUI;

/**
 *
 * @author Shamiso
 */
public class Book {
      private int isbn;
    private String title;
    private String author;
    private double price;
    private String description;
    

    public Book() {
        isbn = 0;
        title = null;
        author = null;
        price = 0;
        description = null;
    }

    public Book(int isbn, String title, String author, double price, String description) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.description = description;
    }
//getters

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
       
    }

    public String getDescription() {
        return description;
    }
  
    
    
    
    
    
//Setters

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + '}';
    }
          
    
    
}

