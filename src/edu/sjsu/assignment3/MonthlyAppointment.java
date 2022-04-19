package edu.sjsu.assignment3;

import java.time.LocalDate;
 // work on this one still
public class MonthlyAppointment extends Appointment{
    protected MonthlyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

    @Override
    public boolean occursOn(LocalDate date) {
        return false;
    }
}
