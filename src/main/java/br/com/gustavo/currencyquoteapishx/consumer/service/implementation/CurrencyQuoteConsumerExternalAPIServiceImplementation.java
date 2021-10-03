package br.com.gustavo.currencyquoteapishx.consumer.service.implementation;

import br.com.gustavo.currencyquoteapishx.app.core.dto.CurrencyQuoteDTO;
import br.com.gustavo.currencyquoteapishx.consumer.service.dto.Root;
import br.com.gustavo.currencyquoteapishx.consumer.service.CurrencyQuoteConsumerExternalAPIService;
import br.com.gustavo.currencyquoteapishx.consumer.service.dto.USDBRL;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CurrencyQuoteConsumerExternalAPIServiceImplementation implements CurrencyQuoteConsumerExternalAPIService {

    @Autowired
    private final RestTemplate restTemplate;

    private final String URI_CURRENCY_QUOTE_USD_BRL = "/last/USD-BRL";

    public CurrencyQuoteDTO externalCallerCurrencyQuote() throws ParseException {
        USDBRL usdbrl = restTemplate.getForObject(URI_CURRENCY_QUOTE_USD_BRL, Root.class).getUSDBRL();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return CurrencyQuoteDTO.builder()
                .code(usdbrl.getCode())
                .codein(usdbrl.getCodein())
                .name(usdbrl.getName())
                .high(usdbrl.getHigh())
                .low(usdbrl.getLow())
                .create_date(sdf.parse(usdbrl.getCreate_date()))
                .build();
    }


    //new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS").parse(usdbrl.getCreate_date())
}
