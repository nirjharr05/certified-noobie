import java.io.*;

abstract class Publication{
    int noOfPages;
    float price;
    String publisherName;

    public Publication(){
        noOfPages = 0;
        price = 0.0f;
        publisherName = "-";
    }
    public void setPublication(int i, float f, String s){
        noOfPages = i;
        price = f;
        publisherName = s;
    }
    public void display() {
        System.out.println("The no of pages are: " + noOfPages);
        System.out.println("The price of the publication is: " + price);
        System.out.println("The name of the publisher is: " + publisherName);
    }
}

class Book extends Publication {
    String bookName;

    public Book() {
        bookName = "-";
    }
    public Book(int i, float f, String s, String n){
        noOfPages = i;
        price = f;
        publisherName = s;
        bookName = n;
    }
    public void setData(int i, float f, String s, String n){
        bookName = n;
        noOfPages = i;
        price = f;
        publisherName = s;
    }
    public void setPages(int i){
        noOfPages = i;
    }
    public void setPrice(float f){
        price = f;
    }
    public void setPublisher(String s){
        publisherName = s;
    }
    public void setBookName(String n) {
        bookName = n;
    }
    public void display() {
        System.out.println("The name of the Book is: " + bookName);
        System.out.println("The no of pages are: " + noOfPages);
        System.out.println("The price of the publication is: " + price);
        System.out.println("The name of the publisher is: " + publisherName);
    }
}

class Journal extends Publication {
    String journalName;
    public Journal() {
        journalName = "-";
    }
    public Journal(int i, float f, String s, String n){
        noOfPages = i;
        price = f;
        publisherName = s;
        journalName = n;
    }
    public void setData(int i, float f, String s, String n){
        journalName = n;
        noOfPages = i;
        price = f;
        publisherName = s;
    }
    public void setPages(int i){
        noOfPages = i;
    }
    public void setPrice(float f){
        price = f;
    }
    public void setPublisher(String s){
        publisherName = s;
    }
    public void setBookName(String n) {
        journalName = n;
    }
    public void display() {
        System.out.println("The name of the Book is: " + journalName);
        System.out.println("The no of pages are: " + noOfPages);
        System.out.println("The price of the publication is: " + price);
        System.out.println("The name of the publisher is: " + publisherName);
    }
}

class Library{
    static int bcount = 0;
    static int jcount = 0;
    Book[] b;
    Journal[] j;
    String[] s;
    public Library(int x, int y) {
        b = new Book[x];
        for(int i=0; i<x; i++){
            b[i] = new Book();
        }
        j = new Journal[y];
        for(int i=0; i<y; i++){
            j[i] = new Journal();
        }
    }
    public void addLibrary(Book ba){
        if(bcount<b.length)
            b[bcount].setData(ba.noOfPages, ba.price, ba.publisherName, ba.bookName);
            bcount++;
    }
    public void addLibrary(Journal ba){
        if(jcount<j.length)
            j[jcount].setData(ba.noOfPages, ba.price, ba.publisherName, ba.journalName);
            jcount++;
    }
    public void display(){
        for(int i=0; i<b.length; i++){
            b[i].display();
            System.out.println();
        }
        for(int i=0; i<j.length; i++){
            j[i].display();
            System.out.println();
        }
    }
}

public class testMain{
    public static void main(String[] args){
        Book[] b = new Book[3];
        Journal[] j = new Journal[2];
        Library l = new Library(3,2); 
        b[0] = new Book(500, 1500.00f, "Oracle1", "Java1");
        b[1] = new Book(550, 1230.00f, "Oracle2", "Java2");
        b[2] = new Book(520, 1550.00f, "Oracle3", "Java3");
        j[0] = new Journal(560, 1000.00f, "Oracle4", "Java4");
        j[1] = new Journal(510, 1050.00f, "Oracle5", "Java5");
        l.addLibrary(b[0]);
        l.addLibrary(b[1]);
        l.addLibrary(b[2]);
        l.addLibrary(j[0]);
        l.addLibrary(j[1]);
        l.display();
    }
}