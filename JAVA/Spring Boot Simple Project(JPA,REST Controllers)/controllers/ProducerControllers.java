package com.capsella.vineguards.controllers;

import com.capsella.vineguards.db.dto.ResponseGetChartsData;
import com.capsella.vineguards.db.dto.ResponseSignIn;

import org.json.JSONException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/producer")
public interface ProducerControllers {


    /**
     * Function to sign up a producer.
     * @param username
     * @param password
     * @return "Success" ,if sign up success.
     */
    @RequestMapping(value = "/signUp", method = RequestMethod.GET )
    public @ResponseBody String signUpProducer(@RequestParam("username") String username,@RequestParam("password") String password);

    /**
     * Function to sign in a producer.
     * @param username
     * @return {@link ResponseSignIn} as JSON, if sign in success.
     */
    @RequestMapping(value = "/signIn", method = RequestMethod.GET , produces = "application/json")
    public ResponseSignIn signInProducer(@RequestParam("username") String username);

    /**
     * Return current weather info for the city.
     * @param cityCode
     * @return weather data as {@link String} in JSON format
     * @throws JSONException
     */
    @RequestMapping(value = "/getWeatherInfo", method = RequestMethod.GET )
    public @ResponseBody String getWeatherInfo(@RequestParam("cityCode") String cityCode) throws JSONException;


    /**
     * Return chart data from weather.
     * @return A {@link List} of {@link ResponseGetChartsData} as JSON.
     */
    @RequestMapping(value = "/getChartsData", method = RequestMethod.GET , produces = "application/json")
    public List<ResponseGetChartsData> getChartsData();
}
