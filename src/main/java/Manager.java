import java.time.Period;
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
        super(idEmployee, firstName, lastName, phoneNumber, username, password, email);
    }

    public Manager() {
    }


    public void assignTool(Tool tool, Plumber plumber, long id){
        new ToolAssignment(id, plumber, tool);
    }


    @Override
    public String toString() {
        return "Manager{}";
    }
}
