package org.acme.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "CONJURED")
public class Conjured extends Item {

    @Id
    @OneToOne
    @JoinColumn(name="item")
    private Item item;

    Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateItem() {
        updateSellIn();
        updateQuality();
    }

    void updateQuality() {
        if (quality > 0 && sellIn >= 0) {
            quality = quality - 2;
        } else {
            quality = quality - 4;
        }
    }

    void updateSellIn() {
        sellIn = sellIn - 1;
    }
}
