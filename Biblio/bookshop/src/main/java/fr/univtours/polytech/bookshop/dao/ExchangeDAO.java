package fr.univtours.polytech.bookshop.dao;

import fr.univtours.polytech.bookshop.model.exchange.WsExchangeResult;

public interface ExchangeDAO {
    WsExchangeResult getExchangeRates();
}
