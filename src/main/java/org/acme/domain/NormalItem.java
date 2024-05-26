package org.acme.domain;

public class NormalItem extends Item {

    NormalItem() {}
    NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality, "Normal");
    }

    public void updateItem() {
        updateSellIn();
        updateQuality();
    }

    void updateQuality() {

        if (sellIn >= 0) {
            quality = quality - 1;
        } else {
            quality = quality - 2;
        }

    }

    void updateSellIn() {
        sellIn = sellIn - 1;
    }
}

