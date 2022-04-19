package edu.sjsu.assignment3;

import java.time.LocalDate;


// work on this one still
public class MonthlyAppointment extends Appointment{
    protected MonthlyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

    @Override
    public boolean occursOn(LocalDate date) {

        if (date.isAfter(getStartDate()) && date.isBefore(getEndDate())) {
            // would date.isBefore(getEndDate()+1) make it inclusive?
            return true;
        }

        // TODO: Make this part work, supposed to check if months are the same
        // if (date.isEqual(getDayofMonth) {
        //return true;
       // }

        else {
            return false;
        }
    }
}
