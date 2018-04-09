package com.openweathermap.model;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

//main":{"temp":291.15,"pressure":1006,"humidity":48,"temp_min":291.15,"temp_max":291.15


@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {


    private double temp;
    private double pressure;
    private double humidity;
    private double temp_min;
    private double temp_max;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Main{");
        sb.append("temp=").append(temp);
        sb.append(", pressure=").append(pressure);
        sb.append(", humidity=").append(humidity);
        sb.append(", temp_min=").append(temp_min);
        sb.append(", temp_max=").append(temp_max);
        sb.append('}');
        return sb.toString();
    }
}
