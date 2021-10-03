package br.com.gustavo.currencyquoteapishx.app.core.dao;

import br.com.gustavo.currencyquoteapishx.app.core.dto.CurrencyQuoteDTO;

import java.util.List;

public interface CurrencyQuoteDAO {
    CurrencyQuoteDTO getLastQuoteCurrency();
    List<CurrencyQuoteDTO> getQuoteCurrencyByTimeCourse(String initialDate, String finalDate);
    void setCurrencyQuoteByExternalCaller(CurrencyQuoteDTO currencyQuoteDTO);
}
