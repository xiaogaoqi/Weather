package com.gao.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 17-5-10.
 */

public class Basic {
    @SerializedName("city")
    public  String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
