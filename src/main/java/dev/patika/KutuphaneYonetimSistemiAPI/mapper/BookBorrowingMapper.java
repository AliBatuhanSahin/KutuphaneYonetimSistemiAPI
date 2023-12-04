package dev.patika.KutuphaneYonetimSistemiAPI.mapper;

import dev.patika.KutuphaneYonetimSistemiAPI.dto.request.BookBorrowingRequest;
import dev.patika.KutuphaneYonetimSistemiAPI.dto.request.BookBorrowingUpdateRequest;
import dev.patika.KutuphaneYonetimSistemiAPI.entity.BookBorrowing;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface BookBorrowingMapper {

    BookBorrowing asEntity(BookBorrowingRequest bookBorrowingRequest);

    BookBorrowing asEntity(BookBorrowingUpdateRequest bookBorrowingUpdateRequest);

    void update(@MappingTarget BookBorrowing entity, BookBorrowingUpdateRequest bookBorrowingUpdateRequest);
}
