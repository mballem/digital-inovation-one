package me.dio.stockquotesapi;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

public interface QuoteRepository extends PagingAndSortingRepository<Quote, Long> {
    @CrossOrigin("*")
    @RestResource(rel = "quotes", path = "quotes")
    List<Quote> findAllBySymbol(@Param("symbol") String symbol, Pageable page);


    Optional<Quote> findFirstBySymbolOrderByTimestampDesc(String teste);
}
