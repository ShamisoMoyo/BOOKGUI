/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.BookGUI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Shamiso
 */
public class Library {
    
      private List<Book> collection;
    
    
   public Library(){
       collection = new ArrayList<Book>();
   }
   
   public void addBook(Book book){
       collection.add(book);
   }
   public String toString(){
       String total = "/n";
       /*
       for  ( int i = 0; i<collection.size();i++) {
       Book b = collection.get(i);
       total = total + b.toString();
   }
*/
     Iterator <Book> i = collection.iterator();
     while(i.hasNext()){
         Book b = (Book)i.next();
     }
       return total;
}
}
    

