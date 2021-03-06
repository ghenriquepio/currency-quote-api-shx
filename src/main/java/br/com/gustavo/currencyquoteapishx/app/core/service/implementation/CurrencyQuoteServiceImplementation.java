package br.com.gustavo.currencyquoteapishx.app.core.service.implementation;

import br.com.gustavo.currencyquoteapishx.app.core.dao.CurrencyQuoteDAO;
import br.com.gustavo.currencyquoteapishx.app.core.dto.CurrencyQuoteDTO;
import br.com.gustavo.currencyquoteapishx.app.core.service.CurrencyQuoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CurrencyQuoteServiceImplementation implements CurrencyQuoteService {

    private final CurrencyQuoteDAO currencyQuoteDAO;

    @Override
    public CurrencyQuoteDTO getLastQuote() {
        return currencyQuoteDAO.getLastQuoteCurrency();
    }

    @Override
    public List<CurrencyQuoteDTO> getQuoteCurrencyByTimeCourse(String initialDate, String finalDate) {
        return currencyQuoteDAO.getQuoteCurrencyByTimeCourse(initialDate, finalDate);
    }

}
