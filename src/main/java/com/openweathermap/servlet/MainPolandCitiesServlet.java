package com.openweathermap.servlet;

import com.openweathermap.main.GetApi;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/maincities")
public class MainPolandCitiesServlet extends HttpServlet {

    @Inject
    GetApi getApi;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String warszawa = getApi.getWeather("Warszawa");
        String poznan = getApi.getWeather("Poznan");
        String wroclaw = getApi.getWeather("Wroclaw");
        String krakow = getApi.getWeather("Krakow");
        String gdansk = getApi.getWeather("Gdansk");

        PrintWriter printWriter = resp.getWriter();

        printWriter.print("Weather for Warsaw is:  \n");
        printWriter.write(warszawa);
        printWriter.print("\n");
        printWriter.print("\n");
        printWriter.print("Weather for Poznan is:  \n");
        printWriter.write(poznan);
        printWriter.print("\n");
        printWriter.print("\n");
        printWriter.print("Weather for Wroclaw is:  \n");
        printWriter.write(wroclaw);
        printWriter.print("\n");
        printWriter.print("\n");
        printWriter.print("Weather for Krakow is:  \n");
        printWriter.write(krakow);
        printWriter.print("\n");
        printWriter.print("\n");
        printWriter.print("Weather for Gdansk is:  \n");
        printWriter.write(gdansk);


        printWriter.close();
    }
}
