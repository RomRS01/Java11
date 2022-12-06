package ru.netology.statistic;

public class ProductManager {
    private int maxLimit = 10;
    private PurchaseItem[] items = new PurchaseItem[0];

    public ProductManager() {
        this.maxLimit = 10;
    }

    public ProductManager(int maxLimit) {
        this.maxLimit = maxLimit;
    }


    public void all(PurchaseItem item) {
        PurchaseItem[] tmp = new PurchaseItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }


    public PurchaseItem[] findLast() {
        if (maxLimit > items.length) {
            maxLimit = items.length;
        }
        PurchaseItem[] reversed = new PurchaseItem[maxLimit];

        for (int j = 0; j < maxLimit; j++) {
            if (maxLimit > items.length) {
                reversed[j] = null;
            } else {
                reversed[j] = items[items.length - 1 - j];
            }
        }
        return reversed;
    }


    public PurchaseItem[] getItems() {
        return items;
    }

}
