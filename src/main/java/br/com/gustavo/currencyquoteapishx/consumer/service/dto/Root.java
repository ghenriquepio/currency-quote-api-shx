package br.com.gustavo.currencyquoteapishx.consumer.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Root {
    @JsonProperty("USDBRL")
    public USDBRL uSDBRL;
}
