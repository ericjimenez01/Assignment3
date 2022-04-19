package edu.sjsu.assignment3;

import java.time.LocalDate;
// work on this one still
public class DailyAppointment extends Appointment {
    protected DailyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

    @Override
    public boolean occursOn(LocalDate date) {
        if (date.isAfter(getStartDate()) && date.isBefore(getEndDate()))  {
            // would date.isBefore(getEndDate()+1) make it inclusive?
            return true;
        }

        else {
            return false;
        }
    }
}