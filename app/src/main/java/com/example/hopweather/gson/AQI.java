package com.example.hopweather.gson;

/**
 * Created by PYX on 2018/6/8.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
