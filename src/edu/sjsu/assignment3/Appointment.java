package edu.sjsu.assignment3;

import java.time.LocalDate;

public abstract class Appointment implements Comparable<Appointment>{
    private final String description;
    private final LocalDate startDate;
    private final LocalDate endDate;

    protected Appointment(String description, LocalDate startDate, LocalDate endDate) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

   // @Override
   // public int compareTo(Appointment other){
        //TODO: Implement based on requirement
        //it will be ordered by start date first,then the end date, finally the description
    //    return startDate - o.startDate;
   // }

    public abstract boolean occursOn(LocalDate date);

    public String getDescription() {
        return description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }


}
