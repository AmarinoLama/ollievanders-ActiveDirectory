package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.acme.domain.Item;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class ServiceTest {

    @PersistenceContext
    jakarta.persistence.EntityManager em;

    @Inject
    Service servicio;

    @Test
    @Transactional
    void updateDatabaseTest(){
        List<Item> items = Item.getAllItems();
        int quality0 = items.get(0).getQuality();
        int quality1 = items.get(1).getQuality();
        servicio.updateDatabase();
        assertEquals(quality0 - 1, items.get(0).getQuality());
        assertEquals(quality1 + 2, items.get(1).getQuality());
    }

}