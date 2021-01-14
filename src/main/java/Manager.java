import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Manager extends Employee {
    private static final Random random = new Random();
    public Manager(int idEmployee,
                   String firstName,
                   String lastName,
                   int phoneNumber,
                   String username,
                   String password,
                   String email) {
        super((long) idEmployee, firstName, lastName, phoneNumber, username, password, email);
    }

    public Manager() {
    }


    public void assignTool(Tool tool, Plumber plumber, long id){
        new ToolAssignment(id, plumber, tool);
    }


    public List<Appointment> viewCurrentAppointments(Plumber plumber){
        return new ArrayList<>();
    }

    public void viewTimeTable(Plumber plumber){

    }

    @Override
    public String toString() {
        return "Manager{}";
    }
}
