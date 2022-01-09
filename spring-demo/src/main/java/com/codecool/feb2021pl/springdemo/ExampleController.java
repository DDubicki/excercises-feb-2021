package com.codecool.feb2021pl.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ExampleController {

    // Don't do this!! SimpleDateFormat is not thread safe!
    DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
    DateFormat timeFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

    @GetMapping("/current_date")
    @ResponseBody
    public String showDate() {
        Date date = new Date();
        return dateFormat.format(date);
    }

    @GetMapping("/current_date_time")
    @ResponseBody
    public String showTime() {
        Date date = new Date();
        return timeFormat.format(date);
    }

}
