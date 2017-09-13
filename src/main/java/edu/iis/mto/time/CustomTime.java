package edu.iis.mto.time;

public class CustomTime implements ITime {

    private final static long ONE_DAY_AND_HOUR = 90000000; //millis

    @Override
    public long currentTimeInMillis() {
        return System.currentTimeMillis() + ONE_DAY_AND_HOUR;
    }
}