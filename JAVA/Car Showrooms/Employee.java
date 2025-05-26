import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showrooms implements Utility {
    String empId;
    String empName;
    String empDepartment;
    int empAge;

    public void getDetails(){
        System.out.println("=====================================");
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: "+ empName);
        System.out.println("Employee Age: "+ empAge);
        System.out.println("Employee Department Id: "+ empDepartment);
        System.out.println("Total employee : "+ totalEmp);
        System.out.println("=====================================");
    }
    public void setDetails(){
        Scanner e = new Scanner(System.in);
        UUID vvid = UUID.randomUUID();
        empId = String.valueOf(vvid);
        System.out.print("Enter Employee Department name: ");
        empDepartment = e.nextLine();
        System.out.print("Enter Employee Name: ");
        empName = e.nextLine();
        System.out.print("Enter Employee Age: ");
        empAge = e.nextInt();
        System.out.print("sHOWROOM NAME: ");
        totalEmp++;
       
    }
}
