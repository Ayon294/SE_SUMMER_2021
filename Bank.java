package ClassPackages;
import InterfacePackages.EmployeeOperations;
import java.util.*;
public class Bank implements EmployeeOperations{
    List<String> list = new ArrayList<String>(100); 
    Scanner in = new Scanner(System.in);
    
    public void getEmployee(String empId){
        
    }
    public void showAllEmployees(){
        System.out.println("\n Employees are:"+list);
    }
    public void setEmployee(Employee e) {
        
        e.setName(e.name);
        e.setempId(Integer.parseInt(e.empId));
        e.setSalary(e.salary);
    }

    public void insertEmployee(Employee e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        setEmployee(e);
        
        list.add(e.getName());
        list.add(Integer.toString(e.getempId()));
        list.add(Double.toString(e.getSalary()));
        
        System.out.println("Employee added sucessfully...");
    }

    public void removeEmployee(Employee e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //System.out.println(e.empId);
        int i;
        for(i=1;i<list.size();i=i+3){
            System.out.println(list.get(i));
            if(e.empId.equals(list.get(i))){
                System.out.println("Match found");
                list.remove(i-1);
                list.remove(i);
                list.remove(i+1);
            }
            else{
                System.out.println("Not found");
            }
        }
        
    }
}
