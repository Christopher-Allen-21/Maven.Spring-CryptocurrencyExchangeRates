package com.zipcoder.cryptonator_api.repositories;

import com.zipcoder.cryptonator_api.domain.Foo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by leon on 1/22/18.
 */
@Repository
public interface FooRepository extends CrudRepository<Foo,String> {
}
