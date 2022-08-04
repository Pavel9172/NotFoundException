package ru.netology.manager;

import ru.netology.Product;
import ru.netology.Repository.ProductRepository;

public class ProductManager {
    private ProductRepository repository = new ProductRepository();

    public ProductManager() {

    }

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductRepository getRepository() {
        return repository;
    }

    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }

    private Product[] products = new Product[0];


    public void add(Product product) {
        repository.add(product);

    }

    public Product[] findAll() {
        return repository.findall();
    }

    public void removeBild(int id) {
        repository.removeByid(id);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product product : repository.findall()) {
            if (matches(product, text)) {
                // "добавляем в конец" массива result продукт product
            }
        }

        return result;
    }

    public boolean matches(Product product, String search) {
        if (product.getTitle().contains(search)) {
            return true;
        } else {
            return false;
        }
        // или в одну строку:
        // return product.getName().contains(search);
    }
}
