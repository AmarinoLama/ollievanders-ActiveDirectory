package org.acme.domain;

public class NormalItem extends Item implements Updateable{

    NormalItem() {}
    NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality, "Normal");
    }

    public void updateItem() {
        updateSellIn();
        updateQuality();
    }

    @Override
    public void updateQuality() {
        if(getSellIn() >= 0){
            setQuality(getQuality() - 1);
        } else {
            setQuality(getQuality() - 2);
        }

        if(getQuality()<0){
            setQuality(0);
        }

    }
}

