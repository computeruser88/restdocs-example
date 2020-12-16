package io.github.computeruser88.restdocsexample.web.mappers;

import io.github.computeruser88.restdocsexample.domain.Beer;
import io.github.computeruser88.restdocsexample.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by Jan Balangue on 12/9/20.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
