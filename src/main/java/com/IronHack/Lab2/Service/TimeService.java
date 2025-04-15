package com.IronHack.Lab2.Service;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class TimeService {


    public String getCurrentTime() {
        return LocalTime.now().toString();
    }

    public String getCurrentDate() {
        return LocalDate.now().toString();
    }

    public String getCurrentDayOfWeek() {
        return DayOfWeek.from(LocalDate.now().getDayOfWeek()).toString();
    }
}

