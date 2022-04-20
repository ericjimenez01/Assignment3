package edu.sjsu.assignment3;

import java.time.LocalDate;

public abstract class Appointment implements Comparable<Appointment>{
    private final String description;
    private final LocalDate startDate;
    private final LocalDate endDate;

    public Appointment(String description, LocalDate startDate, LocalDate endDate) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    @Override
    public int compareTo(Appointment other) {
        //TODO: Implement based on requirement
        //it will be ordered by start date first,then the end date, finally the description
        if (!startDate.isEqual(other.startDate))
            return startDate.compareTo(other.startDate);
        else if (!endDate.equals(other.endDate))
            return endDate.compareTo(other.endDate);
        else return description.compareTo(other.description);
    }
    public abstract boolean occursOn(LocalDate date);

    protected boolean inBetween(LocalDate date){
        return !date.isBefore(startDate) && !date.isAfter(endDate);
        }

    public String getDescription() {

        return description; }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }


}
