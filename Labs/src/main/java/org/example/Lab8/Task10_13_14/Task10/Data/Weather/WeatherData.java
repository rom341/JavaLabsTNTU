package org.example.Lab8.Task10_13_14.Task10.Data.Weather;

public class WeatherData {
    private double latitude;

    @Override
    public String toString() {
        return "WeatherData{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", generationtime_ms=" + generationtime_ms +
                ", utc_offset_seconds=" + utc_offset_seconds +
                ", timezone='" + timezone + '\'' +
                ", timezone_abbreviation='" + timezone_abbreviation + '\'' +
                ", elevation=" + elevation +
                ", current_units=" + current_units +
                ", current=" + current +
                ", hourly_units=" + hourly_units +
                ", hourly=" + hourly +
                '}';
    }

    private double longitude;
    private double generationtime_ms;
    private int utc_offset_seconds;
    private String timezone;
    private String timezone_abbreviation;
    private double elevation;
    private CurrentUnits current_units;
    private Current current;
    private HourlyUnits hourly_units;
    private Hourly hourly;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getGenerationtime_ms() {
        return generationtime_ms;
    }

    public void setGenerationtime_ms(double generationtime_ms) {
        this.generationtime_ms = generationtime_ms;
    }

    public int getUtc_offset_seconds() {
        return utc_offset_seconds;
    }

    public void setUtc_offset_seconds(int utc_offset_seconds) {
        this.utc_offset_seconds = utc_offset_seconds;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezone_abbreviation() {
        return timezone_abbreviation;
    }

    public void setTimezone_abbreviation(String timezone_abbreviation) {
        this.timezone_abbreviation = timezone_abbreviation;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public CurrentUnits getCurrent_units() {
        return current_units;
    }

    public void setCurrent_units(CurrentUnits current_units) {
        this.current_units = current_units;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public HourlyUnits getHourly_units() {
        return hourly_units;
    }

    public void setHourly_units(HourlyUnits hourly_units) {
        this.hourly_units = hourly_units;
    }

    public Hourly getHourly() {
        return hourly;
    }

    public void setHourly(Hourly hourly) {
        this.hourly = hourly;
    }
}
