package edu.sjsu.assignment3;

import java.time.LocalDate;


public class MonthlyAppointment extends Appointment {
    protected MonthlyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

    @Override
    public boolean occursOn(LocalDate date) {
        return inBetween(date) && getStartDate().getDayOfMonth() == date.getDayOfMonth();
    }
}