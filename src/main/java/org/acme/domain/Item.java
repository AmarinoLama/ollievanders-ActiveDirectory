package org.acme.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "items")
public abstract class Item implements Updateable {

    public int idItem = 0;

    public String name = "";

    public int sellIn = 0;

    public int quality = 0;

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
