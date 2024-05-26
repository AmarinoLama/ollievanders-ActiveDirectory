package org.acme.domain;

public class Backstage extends Item implements Updateable{

    Backstage() {}
    Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality, "Backstage Pass");
    }

    public void updateItem() {
        updateSellIn();
        updateQuality();
    }

    @Override
    public void updateQuality() {
        if(getSellIn()>10){
            setQuality(getQuality()+1);
        } else if (getSellIn()<=10 && getSellIn()>5) {
            setQuality(getQuality()+2);
        } else if (getSellIn()<=5 && getSellIn()>=0) {
            setQuality(getQuality()+3);
        } else if (getSellIn()<0) {
            setQuality(0);
        }
        if(getQuality()>50){
            setQuality(50);
        }
    }
}
