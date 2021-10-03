package br.com.gustavo.currencyquoteapishx.consumer.service;

import br.com.gustavo.currencyquoteapishx.app.core.dto.CurrencyQuoteDTO;

import java.text.ParseException;

public interface CurrencyQuoteConsumerExternalAPIService {
    public CurrencyQuoteDTO externalCallerCurrencyQuote() throws ParseException;
}
