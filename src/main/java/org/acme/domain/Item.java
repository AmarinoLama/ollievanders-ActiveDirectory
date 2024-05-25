package org.acme.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "items")
public abstract class Item implements Updateable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public int idItem = 0;

    @Column (name = "NAME_ITEM")
    public String name = "";

    @Column (name = "SELL_IN")
    public int sellIn = 0;

    @Column (name = "QUALITY")
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
