package fr.univtours.polytech.bookshop.dao;

import fr.univtours.polytech.bookshop.model.exchange.WsExchangeResult;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ExchangeDAOImpl implements ExchangeDAO {
    
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/588482b47b5603743b4b210b/latest/EUR";

    @Override
    public WsExchangeResult getExchangeRates() {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                Scanner sc = new Scanner(url.openStream());
                StringBuilder inline = new StringBuilder();
                while (sc.hasNext()) {
                    inline.append(sc.nextLine());
                }
                sc.close();
                ObjectMapper mapper = new ObjectMapper();
                return mapper.readValue(inline.toString(), WsExchangeResult.class);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
