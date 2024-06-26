package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.domain.NormalItem;

@ApplicationScoped
public class NormalItemRepository implements PanacheRepository<NormalItem> {
}
