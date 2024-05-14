package org.example.Lab8.Task10_13_14.Task10.Data.Weather;

class Current {
    private String time;
    private int interval;
    private double temperature_2m;
    private double wind_speed_10m;

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Current{" +
                "time='" + time + '\'' +
                ", interval=" + interval +
                ", temperature_2m=" + temperature_2m +
                ", wind_speed_10m=" + wind_speed_10m +
                '}';
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public double getTemperature_2m() {
        return temperature_2m;
    }

    public void setTemperature_2m(double temperature_2m) {
        this.temperature_2m = temperature_2m;
    }

    public double getWind_speed_10m() {
        return wind_speed_10m;
    }

    public void setWind_speed_10m(double wind_speed_10m) {
        this.wind_speed_10m = wind_speed_10m;
    }
}
