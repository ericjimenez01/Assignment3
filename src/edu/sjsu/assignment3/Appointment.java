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

  // cant get this to work so im commenting it out
   // @Override
   // public int compareTo(Appointment other){
        //TODO: Implement based on requirement
        //it will be ordered by start date first,then the end date, finally the description
        //public int compare(startDate);
            // if (startDate != o.startDate)return startDate - o.startDate;
            // else if return endDate.compareTo(o.endDate);
            // if (endDate != o.endDate)return endDate - o.endDate;
            //else return description.compareTo(o.description);

    //    );
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
