package com.example.hopweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by PYX on 2018/6/7.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private String provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public String getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(String provinceId){
        this.provinceId=provinceId;
    }
}
