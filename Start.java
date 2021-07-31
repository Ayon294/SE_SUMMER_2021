package ClassPackages;
import java.util.Scanner;

public class Start {
    
    
    
    
    public static void main(String args[]){
            int choice,subChoice;
            //InputStream is = new FileInputStream(INPUT_FILE_NAME);
            
            Scanner in = new Scanner( System.in );
            Bank b = new Bank();
            while(true){
                System.out.println("1. Employee Management");
                System.out.println("2. Customer Management");
                System.out.println("3. Account Transactions");
                System.out.println("4. Exit");
                System.out.println("Enter your choice:");
                choice = in.nextInt();
                in.nextLine();
                if(choice == 1){
                    while(true){
                        System.out.println("\nOptions for Employee Management:");
                        System.out.println("\n1.  Insert New Employee " +"  "+ "2.  Remove Existing Employee"+"  "+ "3.  Show All Employee"+ " "+  "4 Going Back ");
                        System.out.println("\nEnter your option:");
                        subChoice = in.nextInt();
                        in.nextLine();
                        if(subChoice==1){
                            Employee e = new Employee();
                            String newEmployeeName;
                            String newEmployeeId;
                            double newSalary;

                            System.out.println("\nEnter the name of your employee:");
                            newEmployeeName = in.nextLine();
                            System.out.println("\nEnter the Id of your employee:");
                            newEmployeeId = in.nextLine();
                            System.out.println("\nEnter the salary of your employee:");
                            newSalary = in.nextDouble();
                            in.nextLine();
                            e.setName(newEmployeeName);
                            e.setfId(Integer.parseInt(newEmployeeId));
                            e.setSalary(newSalary);
                            u.insertEmployee(e);
                        }
                        else if(subChoice==2){
                            Employee e = new Employee();
                            String searchempId;
                            System.out.println("\nEnter the empId of your employee you want to remove:");
                            searchempId = in.nextLine();
                            int id = Integer.parseInt(searchempId);
                            e.setempId(id);
                            u.removeEmployee(e);
                        }
                        else if(subChoice==3){
                            u.showAllEmployee();
                        }
                        else if(subChoice==4){
                            break;
                        }
                        
                }
            }
                else if(choice==4){
                    break;
                }
            
            
        }
        
    }

}