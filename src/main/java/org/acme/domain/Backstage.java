package org.acme.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "BAKSTAGE")
public class Backstage extends Item {

    @Id
    @OneToOne
    @JoinColumn(name="item")
    private Item item;

    Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateItem() {
        updateSellIn();
        updateQuality();
    }

    void updateQuality() {

        if (sellIn >= 11) {
            quality = quality + 1;
        }

        if (sellIn <= 10 && sellIn >= 6) {
            if (quality < 49) {
                quality = quality + 2;
            } else {
                quality = 50;
            }
        }

        if (sellIn <= 5) {
            if (quality < 48) {
                quality = quality + 3;
            } else {
                quality = 50;
            }
        }

        if (sellIn <= 0) {
            quality = 0;
        }
    }

    void updateSellIn() {
        sellIn = sellIn - 1;
    }
}
