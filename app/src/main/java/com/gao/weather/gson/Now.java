package com.gao.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 17-5-10.
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
