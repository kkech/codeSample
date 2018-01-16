package com.capsella.vineguards.db.dto;

import java.util.List;

public class ResponseGetChartsData {
    Long temp;

    Long groundTemp;

    Long humidityTemp;

    Long leafTemp;

    public ResponseGetChartsData() {
    }

    public ResponseGetChartsData(Long temp, Long groundTemp, Long humidityTemp, Long leafTemp) {
        this.temp = temp;
        this.groundTemp = groundTemp;
        this.humidityTemp = humidityTemp;
        this.leafTemp = leafTemp;
    }

    public Long getTemp() {
        return temp;
    }

    public void setTemp(Long temp) {
        this.temp = temp;
    }

    public Long getGroundTemp() {
        return groundTemp;
    }

    public void setGroundTemp(Long groundTemp) {
        this.groundTemp = groundTemp;
    }

    public Long getHumidityTemp() {
        return humidityTemp;
    }

    public void setHumidityTemp(Long humidityTemp) {
        this.humidityTemp = humidityTemp;
    }

    public Long getLeafTemp() {
        return leafTemp;
    }

    public void setLeafTemp(Long leafTemp) {
        this.leafTemp = leafTemp;
    }
}
