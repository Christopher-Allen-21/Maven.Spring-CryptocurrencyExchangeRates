package com.zipcoder.cryptonator_api.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by leon on 1/22/18.
 */
@Entity
public class Foo {

    @Id String tickerSymbol;

    public Foo(){

    }

    public Foo(String tickerSymbol){
        this.tickerSymbol = tickerSymbol;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }
}
