
package com.cse.iitj.application;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "price_string",
        "amount",
        "currency_symbol",
        "currency"
})
public class PriceDetail {

    @JsonProperty("price_string")
    private String priceString;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    @JsonProperty("currency")
    private String currency;

    @JsonProperty("price_string")
    public String getPriceString() {
        return priceString;
    }

    @JsonProperty("price_string")
    public void setPriceString(String priceString) {
        this.priceString = priceString;
    }

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("currency_symbol")
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    @JsonProperty("currency_symbol")
    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
