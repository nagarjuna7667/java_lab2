/*
						Question
Create a class called Book to represent a book.
A Book should include four pieces of information as instance variables‐a book name, an ISBN number, an author name and a publisher.
Your class should have a constructor that initializes the four instance variables.
Provide a mutator method and accessor method (query method) for each instance variable.
In addition, provide a method named getBookInfo() that returns the description of the book as a String (the description should include all the information about the book). You should use this keyword in member methods and constructor.
Write a test application named BookTest to create an array of object for 30 elements for class Book to demonstrate the class Book's capabilities
*/

import java.io.*;

class Book{
    private String bookName;
    private String isbnNumber;
    private String authorName;
    private String publisher;
    
    public Book(){}
    public Book(String bookName, String isbnNumber,String authorName, String publisher){
        this.bookName=bookName;
        this.isbnNumber=isbnNumber;
        this.authorName=authorName;
        this.publisher=publisher;
    }
    
    public void setbookName(String bookName){
        this.bookName=bookName;
    }
    public void setisbnNumber(String isbnNumber){
        this.isbnNumber=isbnNumber;
    }
    public void setauthorName(String authorName){
        this.authorName=authorName;
    }
    public void setpublisher(String publisher){
        this.publisher=publisher;
    }
    
    
    
    public String getbookName (){
        return bookName;
    }
    public String getisbnNumber (){
        return isbnNumber;
    }
    public String getauthorName (){
        return authorName;
    }
    public String getpublisher (){
        return publisher;
    }
    
    
    
    public void changebookName(String bName){
        this.bookName=bName;
    }
    public void changeisbnNumber(String iSBNNumber){
        this.isbnNumber=iSBNNumber;
    }
    public void changeauthorName(String aName){
        this.authorName=aName;
    }
    public void changepublisher(String chgdpublisher){
        this.publisher=chgdpublisher;
    }
    
    public String getBookInfo(){
        String val="Book Name is "+this.bookName+","+"ISBN nunber is "+this.isbnNumber+","+"Author Name is "+this.authorName+","+"Publisher is "+this.publisher+".";
        return val;   
    }
    
}

public class Experiment_4{
         public static void main(String []args){
             Book BookTest[] = new Book[30];
             BookTest[0]= new Book("java","1006n79a","sample","sample2");
             BookTest[0].changeauthorName("sample3");
             System.out.println(BookTest[0].getBookInfo());
         }
}
