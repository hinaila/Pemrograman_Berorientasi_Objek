/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5;

/**
 *
 * @author HP
 */
public class LibraryBook {
    private String title;
    private String author;
    boolean isBorrowed;
    String getTitle;
    String getAuthor;
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setisBorrowed(boolean isBorrowed){
        this.isBorrowed = isBorrowed;
    }
    
    public static void main(String args[]){
        LibraryBook lb = new LibraryBook();
        lb.setTitle("Petualang Naila");
        lb.setAuthor("Naila");
        lb.setisBorrowed(true);
        System.out.println("Title: " + lb.title);
        System.out.println("Author: " + lb.author);
        System.out.println("Is Borrowed: " + lb.isBorrowed);        
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public Boolean getStatus(){
        return isBorrowed;
    }
}

