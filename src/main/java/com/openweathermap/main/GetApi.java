package com.openweathermap.main;

import com.openweathermap.model.RestResponse;


import javax.enterprise.context.RequestScoped;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;

@RequestScoped
public class GetApi {

    private final String APPID = "0b797d4c83a9145b5fd106bf54a1ab52";

    public GetApi() {

    }

    public String getAPPID() {
        return APPID;
    }

    public String getWeather(String city) {

        Client client = ClientBuilder.newClient();
        GetApi API = new GetApi();

        WebTarget openWeatherMap = client.target("http://api.openweathermap.org/data/2.5/weather?q="
                + city
                + ",pl"
                + "&units=metric"
                + "&appid=" + API.getAPPID());

        Response getWeather = openWeatherMap.request().accept(MediaType.APPLICATION_JSON).get();
        RestResponse restResponse = getWeather.readEntity(RestResponse.class);

        StringBuilder builder = new StringBuilder();

        builder.append("Today is: ");
        builder.append(LocalDate.now());
        builder.append(" || Temperature is: ");
        builder.append(restResponse.getMain().getTemp());
        builder.append(" || Temperature Minimum is: ");
        builder.append(restResponse.getMain().getTemp_min());
        builder.append(" [°C]");
        builder.append(" || Temperature Maximum is: ");
        builder.append(restResponse.getMain().getTemp_max());
        builder.append(" [°C]");
        builder.append(" || Pressure is: ");
        builder.append(restResponse.getMain().getPressure());
        builder.append(" [hPa]");
        builder.append(" || Humidity is: ");
        builder.append(restResponse.getMain().getHumidity());
        builder.append(" [%]");

        String weather = builder.toString();

        return weather;

    }
}
