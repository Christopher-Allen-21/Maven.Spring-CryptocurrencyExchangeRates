package com.zipcoder.cryptonator_api.services;

import com.zipcoder.cryptonator_api.repositories.FooRepository;
import org.springframework.stereotype.Service;

/**
 * Created by leon on 1/22/18.
 */
@Service
public class FooService {

    private FooRepository repository;

    public FooService(FooRepository repository){
        this.repository = repository;
    }
}
