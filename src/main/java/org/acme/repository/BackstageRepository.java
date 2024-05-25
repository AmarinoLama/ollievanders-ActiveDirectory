package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.domain.Backstage;

@ApplicationScoped
public class BackstageRepository implements PanacheRepository<Backstage> {
}
