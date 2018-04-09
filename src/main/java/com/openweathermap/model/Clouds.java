package com.openweathermap.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Clouds {

    @JsonProperty("all")
    private Integer all;

    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clouds{");
        sb.append("all=").append(all);
        sb.append('}');
        return sb.toString();
    }
}
