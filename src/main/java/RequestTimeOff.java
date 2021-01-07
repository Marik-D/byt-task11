import java.sql.Date;

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

}
