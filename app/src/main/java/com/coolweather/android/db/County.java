package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
<<<<<<< HEAD
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
=======
    private  int id;
    private String countyName;
    private String weatherId;
    private  int cityId;
>>>>>>> 9d4ce5daec21a506fc4336bbe945b7f6d380f284

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
