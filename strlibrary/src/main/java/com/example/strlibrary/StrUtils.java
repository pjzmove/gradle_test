package com.example.strlibrary;

import android.content.Context;

public class StrUtils {
    private static volatile  StrUtils mInstance = null;
    private static Context mContext = null;
    private StrUtils(){}

    public static StrUtils getInstance(Context context){
        if(mInstance == null){
            synchronized (StrUtils.class){
                if (mInstance == null){
                    mInstance = new StrUtils();
                    mContext = context;
                }
            }
        }
        return  mInstance;
    }

    public String getStr(){
        return "hope test is success";
    }
}
