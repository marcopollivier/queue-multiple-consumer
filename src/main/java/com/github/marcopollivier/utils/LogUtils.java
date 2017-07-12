package com.github.marcopollivier.utils;

import net.logstash.logback.marker.LogstashMarker;
import net.logstash.logback.marker.Markers;

/**
 * Created by marcoollivier on 20/06/17.
 */
public final class LogUtils {

    private static final String KEY_URL = "url";
    private static final String KEY_HTTP_STATUS = "httpStatus";

    /**
     * private constructor
     */
    private LogUtils() {// prevent instantiation
    }


    public static LogstashMarker createLogMarker(String url, int httpStatus) {
        return Markers.append(KEY_URL, url)
                .and(Markers.append(KEY_HTTP_STATUS, httpStatus));
    }

}
