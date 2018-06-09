package com.example.hopweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PYX on 2018/6/8.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
