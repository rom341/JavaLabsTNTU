package org.example.Lab8.Task10_13_14.Task10.Data.Currency;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Currency {
    @JsonProperty("StartDate")
    private String StartDate;
    @JsonProperty("TimeSign")
    private String TimeSign;
    @JsonProperty("CurrencyCode")
    private String CurrencyCode;
    @JsonProperty("CurrencyCodeL")
    private String CurrencyCodeL;
    @JsonProperty("Units")
    private int Units;
    @JsonProperty("Amount")
    private double Amount;

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getTimeSign() {
        return TimeSign;
    }

    public void setTimeSign(String timeSign) {
        TimeSign = timeSign;
    }

    public String getCurrencyCode() {
        return CurrencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        CurrencyCode = currencyCode;
    }

    public String getCurrencyCodeL() {
        return CurrencyCodeL;
    }

    public void setCurrencyCodeL(String currencyCodeL) {
        CurrencyCodeL = currencyCodeL;
    }

    public int getUnits() {
        return Units;
    }

    public void setUnits(int units) {
        Units = units;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "StartDate='" + StartDate + '\'' +
                ", TimeSign='" + TimeSign + '\'' +
                ", CurrencyCode='" + CurrencyCode + '\'' +
                ", CurrencyCodeL='" + CurrencyCodeL + '\'' +
                ", Units=" + Units +
                ", Amount=" + Amount +
                '}';
    }
}
