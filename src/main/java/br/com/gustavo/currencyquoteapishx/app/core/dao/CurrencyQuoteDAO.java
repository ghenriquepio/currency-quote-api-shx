package br.com.gustavo.currencyquoteapishx.app.core.dao;

import br.com.gustavo.currencyquoteapishx.app.core.dto.CurrencyQuoteDTO;

public interface CurrencyQuoteDAO {
    CurrencyQuoteDTO getLastQuoteCurrency();
}
