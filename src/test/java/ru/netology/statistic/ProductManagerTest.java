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

    @BeforeEach
    public void setup() {
        manager.setAll(item1);
        manager.setAll(item2);
        manager.setAll(item3);
        manager.setAll(item4);
        manager.setAll(item5);
        manager.setAll(item6);
        manager.setAll(item7);
        manager.setAll(item8);
        manager.setAll(item9);
        manager.setAll(item10);
        manager.setAll(item11);
    }

    @Test
    public void testFindAll() {
        PurchaseItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11};
        PurchaseItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouFindLast() {

        PurchaseItem[] expected = {item11, item10, item9, item8, item7};
        PurchaseItem[] actual = manager.findLast(5);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouFindLastTen() {

        PurchaseItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
        PurchaseItem[] actual = manager.findLastTen();
        Assertions.assertArrayEquals(expected, actual);
    }


}
