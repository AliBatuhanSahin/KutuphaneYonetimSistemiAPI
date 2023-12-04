package dev.patika.KutuphaneYonetimSistemiAPI.repository;

import dev.patika.KutuphaneYonetimSistemiAPI.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
    Optional<Publisher> findByNameAndEstablishmentYear(String name, Integer year);
}
