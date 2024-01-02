package com.thanhkhac.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Gập bụng 100 cái";
    }
}
