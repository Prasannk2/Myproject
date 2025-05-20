import java.util.Scanner;

class Showroom implements Utility{
    String showroomName;
    String showroomAdd;
    int totalCarInStock;
    String managerName;

    public void getDetails(){
        System.out.println("=====================================");
        System.out.println("Showroom Name: " + showroomName);
        System.out.println("Showroom Address: " + showroomAdd);
        System.out.println("Total Car in Showroom: " + totalCarInStock);
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
        System.out.print("Total Car in showroom: ");
        totalCarInStock = s.nextInt();

        
    }
}