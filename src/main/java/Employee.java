import java.util.Objects;

public class Employee {
    private int idEmployee;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String username;
    private String password;
    private String email;

    public Employee(int idEmployee, String firstName, String lastName, int phoneNumber, String username, String password, String email) {
        this.idEmployee = idEmployee;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Employee() {
    }

    public int getIdEmployee() {return idEmployee; }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact contact(int idReceiver){
        return new Contact(idReceiver, idEmployee);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return idEmployee == employee.idEmployee &&
                phoneNumber == employee.phoneNumber &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(username, employee.username) &&
                Objects.equals(password, employee.password) &&
                Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmployee, firstName, lastName, phoneNumber, username, password, email);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
