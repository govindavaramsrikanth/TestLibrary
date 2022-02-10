package com.example.trace;

import android.util.Log;

public class TraceUtil {

    public static void d(String tag, String message) {
        Log.d(tag, message);
    }


    public void e(String tag, String message) {
        Log.d(tag, message);
    }
}