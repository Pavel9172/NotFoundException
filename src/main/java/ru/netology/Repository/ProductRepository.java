package ru.netology.Repository;

import ru.netology.Product;

public class ProductRepository {
    Product[] products = new Product[0];

    public ProductRepository() {

    }

    public ProductRepository(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];

        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product[] findall() {
        return getProducts();
    }

    public Product findByid(int id){
        for (Product product : products){
            if (product.getId() == id){
                return product;
            }
        }
        return null;

    }

    public void removeByid(int id) {
        if (findByid(id) == null) {
            throw new NotFoundException("ID для удаления не существует" + id);
        }
        int length = products.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[index] = product;
                index++;
            }
        }
        products = tmp;
    }
}
