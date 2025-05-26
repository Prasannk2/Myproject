import java.util.Scanner;

class Showrooms implements Utility{
    String showroomName;
    String showroomAdd;
    int totalCarInStock;
    String managerName;
    int totalEmp = 0 ;

    public void getDetails(){
        System.out.println("=====================================");
        System.out.println("Showroom Name: " + showroomName);
        System.out.println("Showroom Address: " + showroomAdd);
        System.out.println("Total Car in stock: " + totalCarInStock);
        System.out.println("Manager Name: "+ managerName);
        System.out.println("=====================================");
        // System.out.println("Total Number Employee: " + totalEmp);
    }
    public void setDetails(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter showroomName: ");
        showroomName = s.nextLine();
        // System.out.println();
        System.out.print("Enter showroom Address: ");
        showroomAdd = s.nextLine();
        // System.out.println();
        System.out.print("Manager Name: ");
        managerName = s.nextLine();
        // System.out.println();
        System.out.print("Total Car in stock: ");
        totalCarInStock = s.nextInt();

        
    }
}
