package edu.sjsu.assignment3;

import java.time.LocalDate;

public class OnetimeAppointment extends Appointment{
    protected OnetimeAppointment(String description, LocalDate startDate) {
        super(description, startDate, startDate);
    }

    @Override
    public boolean occursOn(LocalDate date) {
        return date.isEqual(getStartDate());
    }
}
