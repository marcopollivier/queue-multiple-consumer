package com.github.marcopollivier.utils;

import com.google.gson.Gson;

/**
 * Created by marcoollivier on 20/06/17.
 */
public final class JsonUtils {

    /**
     * private constructor
     */
    private JsonUtils() {// prevent instantiation
    }

    public static String convertToJson(Object obj) {
        Gson body = new Gson();
        return body.toJson(obj);
    }

}
