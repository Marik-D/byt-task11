import java.sql.Date;
import java.util.Objects;

public class RequestTimeOff {
    private int idRequest;
    private int idEmployee;
    private Date StartTime;
    private Date EndTime;

    public RequestTimeOff(int idRequest, int idEmployee, Date startTime, Date endTime) {
        this.idRequest = idRequest;
        this.idEmployee = idEmployee;
        StartTime = startTime;
        EndTime = endTime;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public Date getEndTime() {
        return EndTime;
    }

    public void setEndTime(Date endTime) {
        EndTime = endTime;
    }

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestTimeOff that = (RequestTimeOff) o;
        return idRequest == that.idRequest &&
                idEmployee == that.idEmployee &&
                Objects.equals(StartTime, that.StartTime) &&
                Objects.equals(EndTime, that.EndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRequest, idEmployee, StartTime, EndTime);
    }

    @Override
    public String toString() {
        return "RequestTimeOff{" +
                "idRequest=" + idRequest +
                ", idEmployee=" + idEmployee +
                ", StartTime=" + StartTime +
                ", EndTime=" + EndTime +
                '}';
    }
}

