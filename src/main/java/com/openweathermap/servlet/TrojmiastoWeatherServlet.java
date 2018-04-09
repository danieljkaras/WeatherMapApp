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

@WebServlet(urlPatterns = "/trojmiasto")
public class TrojmiastoWeatherServlet extends HttpServlet {

    @Inject
    GetApi getApi;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String gdansk = getApi.getWeather("Gdansk");
        String gdynia = getApi.getWeather("Gdynia");

        PrintWriter printWriter = resp.getWriter();

        printWriter.print("Weather for Gdansk is:  \n");
        printWriter.print(gdansk);
        printWriter.print("\n");
        printWriter.print("\n");
        printWriter.print("Weather for Gdynia is:  \n");
        printWriter.print(gdynia);

        printWriter.close();
    }
}
