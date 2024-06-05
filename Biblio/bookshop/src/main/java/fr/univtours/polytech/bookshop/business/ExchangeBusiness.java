package fr.univtours.polytech.bookshop.business;

import fr.univtours.polytech.bookshop.model.exchange.WsExchangeResult;

public interface ExchangeBusiness {
    WsExchangeResult getExchangeRates();
}
