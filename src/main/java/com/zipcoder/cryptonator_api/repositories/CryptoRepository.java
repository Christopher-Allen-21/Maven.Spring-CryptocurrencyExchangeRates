package com.zipcoder.cryptonator_api.repositories;

import com.zipcoder.cryptonator_api.domain.CryptoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by leon on 1/22/18.
 */
@Repository
public interface CryptoRepository extends CrudRepository<CryptoEntity,String> {
}