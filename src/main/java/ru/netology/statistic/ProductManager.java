package ru.netology.statistic;

public class ProductManager {
    public int maxLimit = 10;

    private PurchaseItem[] items = new PurchaseItem[0];

    public void All(PurchaseItem item) {
        PurchaseItem[] tmp = new PurchaseItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }


    public PurchaseItem[] findLast(int resultLength) {
        PurchaseItem[] reversed = new PurchaseItem[resultLength];
        for (int j = 0; j < resultLength; j++) {
            reversed[j] = items[items.length - 1 - j];
        }
        return reversed;
    }
    public PurchaseItem[] findLastTen() {
        PurchaseItem[] reversed = new PurchaseItem[maxLimit];
        for (int j = 0; j < maxLimit; j++) {
            reversed[j] = items[items.length - 1 - j];
        }
        return reversed;
    }

    public PurchaseItem[] getItems() {
        return items;
    }

}
