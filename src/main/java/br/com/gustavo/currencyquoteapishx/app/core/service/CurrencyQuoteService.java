package br.com.gustavo.currencyquoteapishx.app.core.service;

import br.com.gustavo.currencyquoteapishx.app.core.dto.CurrencyQuoteDTO;

public interface CurrencyQuoteService {
    CurrencyQuoteDTO getLastQuote();
}
