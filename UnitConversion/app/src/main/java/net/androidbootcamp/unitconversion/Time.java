package net.androidbootcamp.unitconversion;

import java.util.ArrayList;

public class Time {
    double seconds;
    double minutes;
    double hours;
    double days;
    double weeks;
    double fortnights;
    double months;
    double years;


    //Constructor based on seconds
    Time(double seconds) {
        this.seconds = seconds;
        secsToMinutes(seconds);
        secsToHours(seconds);
        secsToDays(seconds);
        secsToWeeks(seconds);
        secsToFortnights(seconds);
        secsToMonths(seconds);
        secsToYears(seconds);
    }


    //convert from seconds to other units
    void secsToMinutes(double seconds) {
        this.minutes = seconds / 60;
    }

    void secsToHours (double seconds) {
        this.hours = seconds / 60 / 60;
    }

    void secsToDays (double seconds) {
        this.days = seconds / 60 / 60 / 24;
    }

    void secsToWeeks (double seconds) {
        this.weeks = seconds / 60 / 60 / 24 / 7;
    }

    void secsToFortnights(double seconds) {
        this.fortnights = seconds / 60 / 60 / 24 / 7 / 2;
    }

    void secsToMonths(double seconds) {
        this.months = seconds / 60 / 60 / 24 / 30.4167;
    }

    void secsToYears(double seconds) {
        this.years = seconds / 60 / 60 / 24 / 365;
    }




    //getters (setters unnecessary)

    public double getSeconds() {
        return seconds;
    }

    public double getMinutes() {
        return minutes;
    }

    public double getHours() {
        return hours;
    }

    public double getDays() {
        return days;
    }

    public double getWeeks() {
        return weeks;
    }

    public double getFortnights() {
        return fortnights;
    }

    public double getMonths() {
        return months;
    }

    public double getYears() {
        return years;
    }
}
