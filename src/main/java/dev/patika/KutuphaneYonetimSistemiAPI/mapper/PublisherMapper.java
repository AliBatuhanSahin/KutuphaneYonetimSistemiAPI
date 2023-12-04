package dev.patika.KutuphaneYonetimSistemiAPI.mapper;

import dev.patika.KutuphaneYonetimSistemiAPI.dto.response.PublisherResponse;
import dev.patika.KutuphaneYonetimSistemiAPI.entity.Publisher;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PublisherMapper {
    PublisherResponse asOutput(Publisher publisher);

    List<PublisherResponse> asOutput(List<Publisher> publishers);
}
