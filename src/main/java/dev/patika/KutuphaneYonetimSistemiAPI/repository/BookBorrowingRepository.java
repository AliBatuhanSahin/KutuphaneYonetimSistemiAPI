package dev.patika.KutuphaneYonetimSistemiAPI.repository;

import dev.patika.KutuphaneYonetimSistemiAPI.entity.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookBorrowingRepository extends JpaRepository<BookBorrowing, Long> {
}
