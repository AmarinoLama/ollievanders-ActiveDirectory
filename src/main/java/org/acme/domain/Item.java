package org.acme.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "t_items")
public class Item extends PanacheEntityBase {

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

    public Item(String name, int sellIn, int quality, String tipo) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.tipo = tipo;
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

    public static List<Item> getAllItems() {
        return Item.listAll();
    }

    public static List<Item> getItemByName(String nameItem) {
        return Item.getAllItems()
                .stream()
                .filter(item -> item.getName().equals(nameItem))
                .toList();
    }
}
