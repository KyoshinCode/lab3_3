package edu.iis.mto.time;

public class SystemTime implements ITime {
    @Override
    public long currentTimeInMillis() {
        return System.currentTimeMillis();
    }
}