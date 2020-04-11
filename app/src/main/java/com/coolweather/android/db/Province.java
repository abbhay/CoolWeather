package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
<<<<<<< HEAD
    private  String provinceName;
=======
    private String provinceName;
>>>>>>> 9d4ce5daec21a506fc4336bbe945b7f6d380f284
    private int provinceCode;

    public int getId() {
        return id;
    }

<<<<<<< HEAD
    public void setId(int id) {
        this.id = id;
    }

=======
>>>>>>> 9d4ce5daec21a506fc4336bbe945b7f6d380f284
    public String getProvinceName() {
        return provinceName;
    }

<<<<<<< HEAD
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

=======
>>>>>>> 9d4ce5daec21a506fc4336bbe945b7f6d380f284
    public int getProvinceCode() {
        return provinceCode;
    }

<<<<<<< HEAD
=======
    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

>>>>>>> 9d4ce5daec21a506fc4336bbe945b7f6d380f284
    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
