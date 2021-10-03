package br.com.gustavo.currencyquoteapishx.app.core.service;

import br.com.gustavo.currencyquoteapishx.app.core.dto.CurrencyQuoteDTO;

import java.util.List;

public interface CurrencyQuoteService {
    CurrencyQuoteDTO getLastQuote();
    List<CurrencyQuoteDTO> getQuoteCurrencyByTimeCourse(String initialDate, String finalDate);
}
