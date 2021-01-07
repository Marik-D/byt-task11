import java.awt.*;
import java.sql.Time;

public class Appointment {

    Time StartTime;
    Time endTime;
    String location;
    String jobDescription;


    public Appointment(Time startTime, Time endTime, String location, String jobDescription) {
        StartTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.jobDescription = jobDescription;
    }

    public Time getStartTime() {
        return StartTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public String getLocation() {
        return location;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setStartTime(Time startTime) {
        StartTime = startTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void notification(){}

    public List<Appointment> viewCurrentAppointment(Plumber idPlumber){
        return appointmnet;
    }

}
