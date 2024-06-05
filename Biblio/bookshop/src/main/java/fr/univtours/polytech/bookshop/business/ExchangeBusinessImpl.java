package fr.univtours.polytech.bookshop.business;

import fr.univtours.polytech.bookshop.dao.ExchangeDAO;
import fr.univtours.polytech.bookshop.model.exchange.WsExchangeResult;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class ExchangeBusinessImpl implements ExchangeBusiness {

    @Inject
    private ExchangeDAO exchangeDAO;

    @Override
    public WsExchangeResult getExchangeRates() {
        return exchangeDAO.getExchangeRates();
    }
}
