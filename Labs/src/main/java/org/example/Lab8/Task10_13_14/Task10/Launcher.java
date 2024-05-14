package org.example.Lab8.Task10_13_14.Task10;

import org.example.Lab8.Task10_13_14.Task10.Data.Currency.Currency;
import org.example.Lab8.Task10_13_14.Task10.Data.JsonMapers.JsonArrayMapper;
import org.example.Lab8.Task10_13_14.Task10.Data.JsonMapers.JsonObjectMapper;
import org.example.Lab8.Task10_13_14.Task10.Data.Weather.WeatherData;

public class Launcher {
    public static void main(String[] args) {
        final String bank_url = "https://bank.gov.ua/NBU_Exchange/exchange?date=14.05.2024&json";
        final String openmeteo_url = "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current=temperature_2m,wind_speed_10m&hourly=temperature_2m,relative_humidity_2m,wind_speed_10m";
        try {
            //bank
            HTTPClient httpClient_bank = new HTTPClient(bank_url);
            String bankPageContentJson = httpClient_bank.GetResponse();
            System.out.printf("\n\n\n%s\n",bankPageContentJson);

            JsonArrayMapper<Currency> jsonArrayMapper_bank = new JsonArrayMapper<>(Currency[].class, Currency.class);
            Currency[] currencies = jsonArrayMapper_bank.map(bankPageContentJson);

            //openmeteo
            HTTPClient httpClient_openmeteo = new HTTPClient(openmeteo_url);
            String openmeteoPageContentJson = httpClient_openmeteo.GetResponse();
            System.out.printf("\n\n\n%s\n",bankPageContentJson);

            JsonObjectMapper<WeatherData> jsonArrayMapper_openmeteo = new JsonObjectMapper<>(WeatherData.class);
            WeatherData weatherData = jsonArrayMapper_openmeteo.map(openmeteoPageContentJson);

            for (Currency currency : currencies) {
                System.out.println(currency);
            }
            System.out.println("\n\n\n");
            System.out.println(weatherData);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
