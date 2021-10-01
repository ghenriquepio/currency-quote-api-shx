package br.com.gustavo.currencyquoteapishx.app.core.dao.implementation;

import br.com.gustavo.currencyquoteapishx.app.core.dao.CurrencyQuoteDAO;
import br.com.gustavo.currencyquoteapishx.app.core.dto.CurrencyQuoteDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CurrencyQuoteDAOImplementation implements CurrencyQuoteDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public CurrencyQuoteDTO getLastQuoteCurrency() {

        String query = "select * from currency_quote desc";

        return null;
    }
}
