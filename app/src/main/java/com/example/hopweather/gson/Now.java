package com.example.hopweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PYX on 2018/6/8.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
