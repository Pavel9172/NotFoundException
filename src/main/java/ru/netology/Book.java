package ru.netology;

public class Book extends Product {

    protected String author;


    public Book(int id, String title, int pages, int summa, String author) {
        super(id, title, pages, summa);
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
