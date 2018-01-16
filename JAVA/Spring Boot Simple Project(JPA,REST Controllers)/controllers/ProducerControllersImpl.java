package com.capsella.vineguards.controllers;

import com.capsella.vineguards.db.dao.ProducerRepository;
import com.capsella.vineguards.db.dto.ResponseGetChartsData;
import com.capsella.vineguards.db.dto.ResponseSignIn;
import com.capsella.vineguards.db.entities.Producer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


@Component
public class ProducerControllersImpl implements ProducerControllers {

    @Autowired
    ProducerRepository producerRepository;

    private static final Logger logger = LoggerFactory.getLogger(ProducerControllersImpl.class);

    @Override
    public @ResponseBody String signUpProducer(@RequestParam("username") String username,@RequestParam("password") String password){
        Producer producer = new Producer(username,password);
        producerRepository.save(producer);
        return "Success";
    }

    @Override
    public ResponseSignIn signInProducer(@RequestParam("username") String username){
        //Producer producer = producerRepository.findProducerByUsername(username);
        ResponseSignIn responseSignIn = new ResponseSignIn("testUserName","testName","testSurname","test@gmail.com",25L,"testVariety","https://en.wikipedia.org/wiki/Main_Page");
        return responseSignIn;
    }

    @Override
    public String getWeatherInfo(String cityCode) throws JSONException {
        RestTemplate restTemplate = new RestTemplate();
        String quote = restTemplate.postForObject("http://samples.openweathermap.org/data/2.5/forecast?lat=36&lon=139&appid=5905868&APPID=01c8ba0ed094c9a577e0eee7f39bfde3", null,String.class);
        JSONObject jsonObject = new JSONObject(quote);
        JSONArray list = jsonObject.getJSONArray("list");
        Double avgTempKel = 0d;
        Double avgLowTempKel = 0d;
        Double humidity = 0d;


        for (int index=0; index<list.length(); ++index) {
            JSONObject curr = list.getJSONObject(index);
            JSONObject main = curr.getJSONObject("main");
            avgTempKel = avgTempKel + main.getLong("temp");
            avgLowTempKel = avgLowTempKel + main.getLong("temp_min");
            humidity = humidity + main.getLong("humidity");
            JSONArray weather = curr.getJSONArray("weather");
            for (int index1 = 0; index1 < weather.length(); ++index1) {
                JSONObject curr1 = weather.getJSONObject(index1);
                //logger.info(curr1.toString());

                String weatherDesc = curr1.getString("main");
                if (weatherDesc.equals("Snow")) {
                    logger.info("!!!!Snow is coming : " + weatherDesc);
                }
            }
        }
        avgTempKel = avgTempKel / list.length();
        avgLowTempKel = avgLowTempKel / list.length();
        humidity = humidity / list.length();


        Double avgTempCel = KelvinTocelsious(avgTempKel);
        Double avgLowTempCel = KelvinTocelsious(avgLowTempKel);


        String avgTempCelString = new DecimalFormat("##.##").format(avgTempCel);
        String avgLowTempCelString = new DecimalFormat("##.##").format(avgLowTempCel);

        if(avgTempCel > 21){
            logger.info("!!!!Avg temp too high : " + avgTempCelString);
        }else if(avgTempCel < 13){
            logger.info("!!!!Avg temp too low : " + avgLowTempCelString);
        }
        logger.info("Avg temp for next 5 days : " + avgTempCelString);
        logger.info("Avg low temp for next 5 days : " + avgLowTempCelString);
        logger.info("Avg humidity for next 5 days : " + humidity);


        return quote;
    }

	//TODO Get original data from API
    @Override
    public List<ResponseGetChartsData> getChartsData(){

        List<ResponseGetChartsData> responseGetChartsData = new ArrayList<ResponseGetChartsData>();

        for(int i = 0;i < 10;i++) {
            responseGetChartsData.add(new ResponseGetChartsData(15L, 16L, 70L, 10L));
        }
        return  responseGetChartsData;
    }

    private Double KelvinTocelsious(Double avgTempKel) {
        return avgTempKel - 272.15;
    }


}
