package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.acme.domain.GildedRose;
import org.acme.domain.Item;
import org.acme.domain.ItemFactory;


import java.util.List;

@ApplicationScoped
public class Service {

    @PersistenceContext
    jakarta.persistence.EntityManager em;

    Service(){}

    @Transactional
    public void updateDatabase(){
        GildedRose shop = new GildedRose();
        List<Item> items = Item.getAllItems();
        for (Item item: items){
            shop.addItem(ItemFactory.makeItem(item));
        }
        shop.updateItems();
        for (Item item: items){
            em.persist(item);
        }
        /* no se actalizan los datos en la BBDD */
    }

    @Transactional
    void createItem(String name, int sell_in, int quality, String tipo){
        Item newItem = new Item(name, sell_in, quality, tipo);
        newItem.persist();
    }

    public void delete(Item item) {
        item.delete();
    }
}