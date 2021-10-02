package br.com.gustavo.currencyquoteapishx.app.controller;

import br.com.gustavo.currencyquoteapishx.app.core.dto.CurrencyQuoteDTO;
import br.com.gustavo.currencyquoteapishx.app.core.service.CurrencyQuoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/quote"})
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CurrencyQuoteController {

    private final CurrencyQuoteService currencyQuoteService;

    @GetMapping("/")
    public CurrencyQuoteDTO getLastCurrencyQuote(){

        return currencyQuoteService.getLastQuote();
    }
    /*
    @GetMapping
    public String getLastCurrencyQuote(){

        return "NIIICEE";
    }*/
}
