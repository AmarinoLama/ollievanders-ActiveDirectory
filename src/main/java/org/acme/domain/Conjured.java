package org.acme.domain;

public class Conjured extends Item implements Updateable {

    Conjured() {}
    Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality, "Conjured");
    }

    public void updateItem() {
        updateSellIn();
        updateQuality();
    }

    @Override
    public void updateQuality() {
        if(getSellIn() >= 0){
            setQuality(getQuality() - 2);
        } else {
            setQuality(getQuality() - 4);
        }

        if(getQuality()<0){
            setQuality(0);
        }

    }
}
