/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided;

/**
 *
 * @author HP
 */
public class DriverLB {
    public static void main(String args[]){
        LibraryBook lb = new LibraryBook();
        lb.setTitle("Petualang Naila");
        lb.setAuthor("Naila");
        lb.setisBorrowed(true);
        System.out.println("Title: " + lb.getTitle);
        System.out.println("Author: " + lb.getAuthor);
        System.out.println("Is Borrowed: " + lb.isBorrowed);           
    }
    
}
