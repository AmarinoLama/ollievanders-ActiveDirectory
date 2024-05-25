package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.domain.Conjured;

@ApplicationScoped
public class ConjuredRepository implements PanacheRepository<Conjured> {
}
