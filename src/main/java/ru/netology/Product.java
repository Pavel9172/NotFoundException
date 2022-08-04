package ru.netology;

public class Product {
    protected int id;
    protected String title;
    protected int pages;
    protected int summa;

    public Product(int id, String title, int pages, int summa) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.summa = summa;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }


}
