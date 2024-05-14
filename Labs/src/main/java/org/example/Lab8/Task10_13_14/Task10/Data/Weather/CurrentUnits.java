package org.example.Lab8.Task10_13_14.Task10.Data.Weather;

class CurrentUnits {
    private String time;
    private String interval;
    private String temperature_2m;
    private String wind_speed_10m;

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "CurrentUnits{" +
                "time='" + time + '\'' +
                ", interval='" + interval + '\'' +
                ", temperature_2m='" + temperature_2m + '\'' +
                ", wind_speed_10m='" + wind_speed_10m + '\'' +
                '}';
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getTemperature_2m() {
        return temperature_2m;
    }

    public void setTemperature_2m(String temperature_2m) {
        this.temperature_2m = temperature_2m;
    }

    public String getWind_speed_10m() {
        return wind_speed_10m;
    }

    public void setWind_speed_10m(String wind_speed_10m) {
        this.wind_speed_10m = wind_speed_10m;
    }
}