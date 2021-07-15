package com.demo.mcSvc.currencyexchangeservice;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class ExchangeValue {

    @Id
    private Long id;

    private String currencyFrom;

    private String currencyTo;

    private BigDecimal conversionMultiple;

    private int port;

    public ExchangeValue(Long id, String currencyFrom, String currencyTo, BigDecimal conversionMultiple) {
        super();
        this.id = id;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.conversionMultiple = conversionMultiple;
    }

    public ExchangeValue() {
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
