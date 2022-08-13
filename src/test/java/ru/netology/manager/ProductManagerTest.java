package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.Book;
import ru.netology.Product;
import ru.netology.Repository.NotFoundException;
import ru.netology.Repository.ProductRepository;
import ru.netology.Smartphone;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductManagerTest {

    @Test
    void removeIdPass() {

        Product book1 = new Book(1, "Netology", 200, 300, "Кучинский");
        Product smartphone1 = new Smartphone(2, "Nokia", 22, 35000, "Финляндия");
        Product[] expected = new Product[]{book1};
        ProductRepository repository = new ProductRepository();

        repository.add(book1);
        repository.add(smartphone1);


        repository.removeByid(2);
        assertArrayEquals(expected, repository.findall());

    }

    @Test
    void removeIdFaill() {

        Product book1 = new Book(1, "Netology", 200, 300, "Кучинский");
        Product smartphone1 = new Smartphone(2, "Nokia", 22, 35000, "Финляндия");
        Product[] expected = new Product[0];
        ProductRepository repository = new ProductRepository();

        repository.add(book1);
        repository.add(smartphone1);


        assertThrows(NotFoundException.class, () -> {
            repository.removeByid(3);
        });


    }


}