package org.acme.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "SULFURAS")
public class Sulfuras extends Item {

    @Id
    @OneToOne
    @JoinColumn(name="item")
    private Item item;

    Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateItem(){}

}