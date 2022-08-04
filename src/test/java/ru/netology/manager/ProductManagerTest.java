package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.Book;
import ru.netology.Product;
import ru.netology.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    void addOneProduct() {
        ProductManager manager = new ProductManager();
        Product book1 = new Book(1, "Netology", 200, 300, "Кучинский");
        Product[] expected = new Product[]{book1};
        manager.add(book1);


        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void addSomeProduct() {
        ProductManager manager = new ProductManager();
        Product book1 = new Book(1, "Netology", 200, 300, "Кучинский");
        Product book2 = new Book(2, "Netology", 200, 400, "Кучинский");
        Product smartphone1 = new Smartphone(1, "Nokia", 22, 35000, "Финляндия");
        Product smartphone2 = new Smartphone(2, "Nokia", 22, 45000, "Финляндия");
        Product[] expected = new Product[]{book1, book2, smartphone1, smartphone2};
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void add() {
        ProductManager manager = new ProductManager();
        Product book1 = new Book(1, "Netology", 200, 300, "Кучинский");
        Product smartphone1 = new Smartphone(2, "Nokia", 22, 35000, "Финляндия");
        Product[] expected = new Product[]{book1, smartphone1};
        manager.add(book1);
        manager.add(smartphone1);

        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void removeBildTwoProduct() {
        ProductManager manager = new ProductManager();
        Product book1 = new Book(1, "Netology", 200, 300, "Кучинский");
        Product smartphone1 = new Smartphone(2, "Nokia", 22, 35000, "Финляндия");
        Product[] expected = new Product[0];
        manager.add(book1);
        manager.add(smartphone1);
        manager.removeBild(1);
        manager.removeBild(2);

        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void removeBild() {
        ProductManager manager = new ProductManager();
        Product smartphone1 = new Smartphone(1, "Nokia", 22, 35000, "Финляндия");
        Product[] expected = new Product[0];
        manager.add(smartphone1);
        manager.removeBild(1);

        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void searchByidDefferentProduct() {
        ProductManager manager = new ProductManager();
        Product book1 = new Book(1, "Netology", 200, 300, "Кучинский");
        Product book2 = new Book(2, "Netology", 200, 400, "Кучинский");
        Product smartphone1 = new Smartphone(3, "Nokia", 22, 35000, "Финляндия");
        Product smartphone2 = new Smartphone(4, "Nokia", 22, 45000, "Финляндия");
        Product[] expected = new Product[]{smartphone2};
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.removeBild(1);
        manager.removeBild(2);
        manager.removeBild(3);

        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void searchByNotResults() {
        ProductManager manager = new ProductManager();
        Product book1 = new Book(1, "Netology", 200, 300, "Кучинский");
        Product smartphone1 = new Smartphone(2, "Nokia", 22, 35000, "Финляндия");
        Product[] expected = new Product[0];
        manager.add(book1);
        manager.add(smartphone1);


        Product[] actual = manager.searchBy("Nokia");
        assertArrayEquals(expected, actual);

    }

    @Test
    void searchByAuthor() {
        ProductManager manager = new ProductManager();
        Product book1 = new Book(1, "Netology", 200, 300, "Кучинский");
        Product smartphone1 = new Smartphone(2, "Nokia", 22, 35000, "Финляндия");
        Product[] expected = new Product[0];
        manager.add(book1);
        manager.add(smartphone1);


        Product[] actual = manager.searchBy("Кучинский");
        assertArrayEquals(expected, actual);

    }
}