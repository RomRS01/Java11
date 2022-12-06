package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class ProductManagerTest {
    ProductManager repo = Mockito.mock(ProductManager.class);
    ProductManager manager = new ProductManager();


    PurchaseItem item1 = new PurchaseItem("Бладшот");
    PurchaseItem item2 = new PurchaseItem("Вперёд");
    PurchaseItem item3 = new PurchaseItem("Отель Белград");
    PurchaseItem item4 = new PurchaseItem("Джентельмены");
    PurchaseItem item5 = new PurchaseItem("Человек-невидимка");
    PurchaseItem item6 = new PurchaseItem("Тролли. Мировой тур");
    PurchaseItem item7 = new PurchaseItem("Номер один");
    PurchaseItem item8 = new PurchaseItem("Призрачный патруль 2: Восстание проклятых");
    PurchaseItem item9 = new PurchaseItem("Добыча");
    PurchaseItem item10 = new PurchaseItem("Быстрее пули");
    PurchaseItem item11 = new PurchaseItem("На Западном фронте без перемен");
    PurchaseItem item12 = new PurchaseItem("Дюна");

    @BeforeEach
    public void setup() {
        manager.all(item1);
        manager.all(item2);
        manager.all(item3);
        manager.all(item4);
        manager.all(item5);
        manager.all(item6);
        manager.all(item7);
        manager.all(item8);
        manager.all(item9);
        manager.all(item10);
        manager.all(item11);
    }

    @Test
    public void testFindAll() {
        PurchaseItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11};
        PurchaseItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouFindLastFive() {
        ProductManager manager = new ProductManager(5);
        manager.all(item1);
        manager.all(item2);
        manager.all(item3);
        manager.all(item4);
        manager.all(item5);
        manager.all(item6);
        manager.all(item7);
        manager.all(item8);
        manager.all(item9);
        manager.all(item10);
        manager.all(item11);
        PurchaseItem[] expected = {item11, item10, item9, item8, item7};
        PurchaseItem[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouFindLastEleven() {
        ProductManager manager = new ProductManager(11);
        manager.all(item1);
        manager.all(item2);
        manager.all(item3);
        manager.all(item4);
        manager.all(item5);
        manager.all(item6);
        manager.all(item7);
        manager.all(item8);
        manager.all(item9);
        manager.all(item10);
        manager.all(item11);
        PurchaseItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PurchaseItem[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouFindLastTwelve() {
        ProductManager manager = new ProductManager(12);
        manager.all(item1);
        manager.all(item2);
        manager.all(item3);
        manager.all(item4);
        manager.all(item5);
        manager.all(item6);
        manager.all(item7);
        manager.all(item8);
        manager.all(item9);
        manager.all(item10);
        manager.all(item11);
        PurchaseItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PurchaseItem[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
