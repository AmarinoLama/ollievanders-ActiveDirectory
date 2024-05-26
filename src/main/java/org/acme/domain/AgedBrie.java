package org.acme.domain;

public class AgedBrie extends Item implements Updateable {

    AgedBrie() {}
    AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality, "Aged Brie");
    }

    public void updateItem() {
        updateSellIn();
        updateQuality();
    }

    @Override
    public void updateQuality() {
        if(getSellIn()>=0){
            setQuality(getQuality()+1);
        }else{
            setQuality(getQuality()+2);
        }
        if(getQuality()>50){
            setQuality(50);
        }
    }
}