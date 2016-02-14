package com.codegears.programming.util;

import android.util.Log;

public  class Logger {
    private static final  boolean IS_ENABLE = true;

    public  static  void Log (String name, String text){
        if( IS_ENABLE ){
            Log.e(name,text);
        }
    }
}
