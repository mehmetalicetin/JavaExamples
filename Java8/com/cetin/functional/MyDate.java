package com.cetin.functional;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDate {
    String dayName;
    Date currentDate;
    Date nextDate;

    public MyDate() {
        this.currentDate = new Date();
        this.dayName = getDayName(currentDate);
        this.nextDate = getNextDay(currentDate);
    }

    public String getDayName(Date currentDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        return sdf.format(currentDate);
    }

    public String getDayName() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        return sdf.format(currentDate);
    }


    public Date getNextDay(Date currentDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_WEEK, 1);
        Date nextdate = calendar.getTime();
        return nextdate;
    }

    public boolean isWeekend(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        return day == Calendar.SATURDAY || day == Calendar.SUNDAY;
    }

    public static boolean isThursday(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY;
    }
}
