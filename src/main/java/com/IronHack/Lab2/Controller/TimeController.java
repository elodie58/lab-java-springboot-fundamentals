package com.IronHack.Lab2.Controller;


import com.IronHack.Lab2.Service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/time")
public class TimeController {

    private final TimeService timeService;

    public TimeController(final TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String getTime() {
        return "Current time :" + timeService.getCurrentTime();
    }

    @GetMapping("/date")
    public String getDate() {
        return "Current date :" + timeService.getCurrentDate();
    }

    @GetMapping("/day")
    public String getDay() {
        return "Day of the week:" + timeService.getCurrentDate();

    }

    @GetMapping("/all")
    public Map<String, String> getAllTimeInfo() {
        return Map.of(
                "Time", timeService.getCurrentTime(),
                "Date", timeService.getCurrentDate(),
                "Day of week", timeService.getCurrentDayOfWeek()

        );
    }
}