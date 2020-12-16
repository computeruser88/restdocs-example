package io.github.computeruser88.restdocsexample.repositories;

import io.github.computeruser88.restdocsexample.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by Jan Balangue on 12/6/20.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
