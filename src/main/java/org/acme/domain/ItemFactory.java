package org.acme.domain;

public class ItemFactory {

    public static Updateable makeItem(Item item){
        switch (item.getTipo()){
            case "Aged Brie":
                return new AgedBrie(item.getName(), item.getSellIn(), item.getQuality());
            case "Backstage Pass":
                return new Backstage(item.getName(), item.getSellIn(), item.getQuality());
            case "Sulfuras":
                return new Sulfuras(item.getName(), item.getSellIn(), item.getQuality());
            case "Conjured":
                return new Conjured(item.getName(), item.getSellIn(), item.getQuality());
            default:
                return new NormalItem(item.getName(), item.getSellIn(), item.getQuality());
        }
    }
}
