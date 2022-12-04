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
        manager.All(item1);
        manager.All(item2);
        manager.All(item3);
        manager.All(item4);
        manager.All(item5);
        manager.All(item6);
        manager.All(item7);
        manager.All(item8);
        manager.All(item9);
        manager.All(item10);
        manager.All(item11);
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
