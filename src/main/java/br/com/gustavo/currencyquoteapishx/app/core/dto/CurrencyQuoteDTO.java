package br.com.gustavo.currencyquoteapishx.app.core.dto;

import lombok.*;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "currency_quote")
@Data
@AllArgsConstructor
@Builder
@Getter
public class CurrencyQuoteDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    public Date create_date;
}
