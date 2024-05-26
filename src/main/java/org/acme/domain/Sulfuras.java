package org.acme.domain;

public class Sulfuras extends Item implements Updateable{

    Sulfuras() {}
    Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality, "Sulfuras");
    }

    @Override
    public void updateQuality() {}

    public void updateItem(){}

}