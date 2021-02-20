package demo.web.repositories;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import demo.web.domain.Beer;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
