import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Appointment {
    private final Long id;
    private static final List<Appointment> currentAppointments = new ArrayList<>();
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String location;
    private String jobDescription;


    public Appointment(Long id, LocalDateTime startTime, LocalDateTime endTime, String location, String jobDescription) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.jobDescription = jobDescription;
    }

    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void notification() {
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void addAppointment(Appointment appointment) {
        currentAppointments.add(appointment);
    }


    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public List<Appointment> getAllAppointments() {
        return currentAppointments;
    }

    public Optional<Appointment> getAppointmentById(Long id) {
        return currentAppointments.stream().filter(a -> a.id.equals(id)).findAny();
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", location='" + location + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(location, that.location) &&
                Objects.equals(jobDescription, that.jobDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, location, jobDescription);
    }
}
