package ru.netology;

public class Smartphone extends Product {

    protected String manufacturer;

    public Smartphone(int id, String title, int pages, int summa, String manufacturer) {
        super(id, title, pages, summa);
        this.manufacturer = manufacturer;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
