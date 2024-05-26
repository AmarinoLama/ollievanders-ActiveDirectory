package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.domain.Item;

@ApplicationScoped
public class ItemRepository implements PanacheRepository<Item> {
}