package dev.patika.KutuphaneYonetimSistemiAPI.mapper;

import dev.patika.KutuphaneYonetimSistemiAPI.dto.request.BookForBorrowingRequest;
import dev.patika.KutuphaneYonetimSistemiAPI.entity.Book;
import org.mapstruct.Mapper;

@Mapper
public interface BookForBorrowingMapper {

    Book asEntity(BookForBorrowingRequest bookForBorrowingRequest);
}
