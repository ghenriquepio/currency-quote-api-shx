package br.com.gustavo.currencyquoteapishx.app.core.dao.implementation;

import br.com.gustavo.currencyquoteapishx.app.core.dao.CurrencyQuoteDAO;
import br.com.gustavo.currencyquoteapishx.app.core.dto.CurrencyQuoteDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CurrencyQuoteDAOImplementation implements CurrencyQuoteDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public CurrencyQuoteDTO getLastQuoteCurrency() {
        String query = "select * from currency_quote order by create_date desc fetch first 1 rows only;";
        return jdbcTemplate.queryForObject(query, (rs, rowNum) -> new CurrencyQuoteDTO(rs.getInt("id"), rs.getString("code"), rs.getString("codein"), rs.getString("name"), rs.getString("high"), rs.getString("low"), rs.getDate("create_date")));
    }

    @Override
    public List<CurrencyQuoteDTO> getQuoteCurrencyByTimeCourse(String initialDate, String finalDate){
        String query = "select * from currency_quote where create_date between '".concat(initialDate).concat("' and date '".concat(finalDate).concat("' + integer '1' order by create_date asc;"));
        return jdbcTemplate.query(query, (rs, rowNum) -> new CurrencyQuoteDTO(rs.getInt("id"), rs.getString("code"), rs.getString("codein"), rs.getString("name"), rs.getString("high"), rs.getString("low"), rs.getDate("create_date")));
    }

    @Override
    public void setCurrencyQuoteByExternalCaller(CurrencyQuoteDTO currencyQuoteDTO){
        String query = "insert into currency_quote(code, codein, name, high, low, create_date) values(?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(query, currencyQuoteDTO.getCode(), currencyQuoteDTO.getCodein(), currencyQuoteDTO.getName(), currencyQuoteDTO.getHigh(), currencyQuoteDTO.getLow(), currencyQuoteDTO.getCreate_date());
    }
}
