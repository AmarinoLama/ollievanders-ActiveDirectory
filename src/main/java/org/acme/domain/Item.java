package org.acme.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "t_items")
public abstract class Item implements Updateable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long id;

    @Column(name = "nombre")
    public String name;

    @Column(name = "sell_in")
    public int sellIn;

    @Column(name = "quality")
    public int quality;

    @Column(name = "tipo")
    public String tipo;

    public Item() {
    }

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
