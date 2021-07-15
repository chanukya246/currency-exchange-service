package com.demo.mcSvc.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

    ExchangeValue findByCurrencyFromAndCurrencyTo(String from, String to);
}
