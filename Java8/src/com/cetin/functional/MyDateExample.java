package com.cetin.functional;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyDateExample {
    public static void main(String[] args) {
        Supplier supplier = MyDate::new;
        MyDate myDate = (MyDate) supplier.get();

        Function<Date, String> day = myDate::getDayName;
        System.out.println("Day :"+day.apply(myDate.currentDate));

        Supplier supplierDayName = myDate::getDayName;
        System.out.println("Day Name:"+supplierDayName.get());

        Function<Date, Date> nextDay = myDate::getNextDay;
        System.out.println("Next Day :"+nextDay.apply(myDate.currentDate));

        Predicate<Date> isWeekend = myDate::isWeekend;
        System.out.println("is weekend :"+isWeekend.test(myDate.currentDate));

        Predicate<Date> isThursday = MyDate::isThursday;
        System.out.println("is thursday :"+isThursday.test(myDate.nextDate));
    }
}
