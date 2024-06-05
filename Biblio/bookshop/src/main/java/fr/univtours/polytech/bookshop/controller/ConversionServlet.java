package fr.univtours.polytech.bookshop.controller;

import fr.univtours.polytech.bookshop.business.ExchangeBusiness;
import fr.univtours.polytech.bookshop.model.exchange.WsExchangeResult;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/convert")
public class ConversionServlet extends HttpServlet {

    @Inject
    private ExchangeBusiness exchangeBusiness;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("convert.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String amountStr = request.getParameter("amount");
        if (amountStr != null && !amountStr.isEmpty()) {
            double amount = Double.parseDouble(amountStr);
            WsExchangeResult exchangeResult = exchangeBusiness.getExchangeRates();
            Double conversionRate = exchangeResult.getConversionRates().getUsd();
            double amountInEuro = amount / conversionRate;
            amountInEuro = Math.round(amountInEuro * 100.0) / 100.0; // arrondi au centime d'euro

            request.setAttribute("amount", amount);
            request.setAttribute("amountInEuro", amountInEuro);
        }
        request.getRequestDispatcher("convert.jsp").forward(request, response);
    }
}
