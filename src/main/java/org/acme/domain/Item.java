package org.acme.domain;

public abstract class Item implements Updateable {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        StringBuilder salida = new StringBuilder();
        salida.append(this.name).append(", ").append(this.sellIn).append(", ").append(this.quality);
        return salida.toString();
    }
}
