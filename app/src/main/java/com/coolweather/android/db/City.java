package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
<<<<<<< HEAD
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
=======
    private  int id;
    private String cityName;
    private  int cityCode;
    private  int provinceCode;
>>>>>>> 9d4ce5daec21a506fc4336bbe945b7f6d380f284

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

<<<<<<< HEAD
    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
=======
    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
>>>>>>> 9d4ce5daec21a506fc4336bbe945b7f6d380f284
    }
}
