package com.example.hopweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PYX on 2018/6/8.
 */

public class Forecast {
    public String data;

    @SerializedName("tmp")
    public Temperature temperature;
    public class Temperature{
        public String max;
        public String min;
    }

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
