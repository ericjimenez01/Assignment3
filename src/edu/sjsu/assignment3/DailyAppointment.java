package edu.sjsu.assignment3;

import java.time.LocalDate;
// work on this one still
public class DailyAppointment extends Appointment {
    protected DailyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

    @Override
    public boolean occursOn(LocalDate date) {
        return inBetween(date) && getStartDate().getDayOfWeek() == date.getDayOfWeek();
        }
    }
