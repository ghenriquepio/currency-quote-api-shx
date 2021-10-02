package br.com.gustavo.currencyquoteapishx.app.core.dto;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "currency_quote")
public class CurrencyQuoteDTO {

    public CurrencyQuoteDTO(Integer id, String high) {
        this.id = id;
        this.high = high;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Integer id;

    @Column(name="code")
    public String code;
    @Column(name="codein")
    public String codein;
    @Column(name="name")
    public String name;
    @Column(name="high")
    public String high;
    @Column(name="low")
    public String low;
    @Column(name="create_date")
    public String create_date;
}
