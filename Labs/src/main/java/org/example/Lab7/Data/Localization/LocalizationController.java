package org.example.Lab7.Data.Localization;

import java.nio.file.Path;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationController {
    private static final String BundleFilePath = "resource";

    private String Language;
    private String Country;
    private Locale Locale;
    private ResourceBundle Bundle;

    public void setLanguage(String language) {
        Language = language;
        SynchroniseLocalisation();
    }

    public void setCountry(String country) {
        Country = country;
        SynchroniseLocalisation();
    }

    public String getLanguage() {
        return Language;
    }

    public String getCountry() {
        return Country;
    }

    public java.util.Locale getLocale() {
        return Locale;
    }

    public ResourceBundle getBundle() {
        return Bundle;
    }

    public LocalizationController() {
        Language = "uk";
        Country = "UA";
        SynchroniseLocalisation();
    }

    public LocalizationController(String language, String country) {
        Language = language;
        Country = country;
        SynchroniseLocalisation();
    }

    private void SynchroniseLocalisation(){
        Locale = new Locale(Language, Country);
        Bundle = ResourceBundle.getBundle(BundleFilePath, Locale);
    }
}
