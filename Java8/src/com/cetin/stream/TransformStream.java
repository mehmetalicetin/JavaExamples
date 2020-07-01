package com.cetin.stream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class TransformStream {
    public static void main(String[] args) {
        List<String> dateList = new ArrayList<>();
        dateList.add("20/05/1994");
        dateList.add("02/02/2016");
        dateList.add("03/02/2016");
        dateList.add("04/02/2016");
        dateList.add("05/02/2016");
        dateList.add("06/02/2016");
        dateList.add("07/02/2016");


        Stream<String> streamDate = dateList.stream();
        /*     streamDate.map(TransformStream::convertDate).forEach(System.out::println);

        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
       // streamDate.map(TransformStream::convertDate).forEach(System.out::println);

       */
        streamDate = dateList.stream();
        streamDate.map(TransformStream::convertDate).filter(TransformStream::isWeekend).forEach(System.out::println);

    }

    public static Date convertDate(String dateText){
        try {
            if(dateText != null){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return simpleDateFormat.parse(dateText);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean isWeekend(Date date){
        if(date == null)
            return false;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY;
    }
}
