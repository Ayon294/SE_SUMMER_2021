package InterfacePackages;
import ClassPackages.*;
public interface EmployeeOperations {
    public void setEmployee(Employee e);
    public void getEmployee(String empId);
    public void insertEmployee(Employee e);
    public void removeEmployee(Employee e);
    public void showAllEmployees();
}
