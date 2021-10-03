package br.com.gustavo.currencyquoteapishx.app.core.service.implementation;

import br.com.gustavo.currencyquoteapishx.app.core.dao.CurrencyQuoteDAO;
import br.com.gustavo.currencyquoteapishx.consumer.service.CurrencyQuoteConsumerExternalAPIService;
import br.com.gustavo.currencyquoteapishx.consumer.service.dto.USDBRL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public class CurrencyQuoteGatewayServiceImplementation {

    @Autowired
    private CurrencyQuoteDAO currencyQuoteDAO;
    @Autowired
    private CurrencyQuoteConsumerExternalAPIService currencyQuoteConsumerExternalAPIService;

    @Scheduled(fixedRate = 60000)
    public void externalProviderGateway() throws ParseException {
        currencyQuoteDAO.setCurrencyQuoteByExternalCaller(currencyQuoteConsumerExternalAPIService.externalCallerCurrencyQuote());
    }


}
