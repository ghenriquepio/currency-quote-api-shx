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

        String query = "select * from currency_quote order by create_date desc fetch first 1 rows only;";
        //queryForObject
        return jdbcTemplate.queryForObject(query, (rs, rowNum) -> new CurrencyQuoteDTO(rs.getInt("id"), rs.getString("high")));
        // TODO: 02/10/2021  Implementar o resto das informaçoes no queryForObject para ficar show
    }
}
