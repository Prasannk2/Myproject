import java.util.ArrayList;
import java.util.Scanner;

interface Utility {
    public void getDetails();
    public void setDetails();

}

public class Main {

    static void mainMenu() {
        System.out.println("======   Welcome to the Showroom Management System   ===========");
        System.out.println("::::::::::::       Emter Your Choice      ::::::::::::::::::::::");
        System.out.println("1.} ADD SHOWROOM\t\t\t 2.} ADD EMPLOYEE\t\t\t 3.}ADD CARS");
        System.out.println("4.} GET SHOWROOM\t\t\t 5.} GET EMPLOYEE\t\t\t 6.}GET CARS");
        System.out.println(":::::::::::::::::        Enter 0 to Exit        ::::::::::::::::");
    }

    public static void main(String args[]) {
        Scanner mn = new Scanner(System.in);
        Showroom showroom[] = new Showroom[100];
        Employee employee[] = new Employee[500];
        Cars car[] = new Cars[1000];
        int showroomCount = 0, employeeCount = 0, carCount = 0;
        int choice = 100;
        System.out.println("dk");
        while (choice!=0) {

            mainMenu();
            choice = mn.nextInt();
            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        if(showroomCount < 100){
                        showroom[showroomCount] = new Showroom();
                        showroom[showroomCount++].setDetails();
                        System.out.println();
                        System.out.println("1.} ADD NEW SHOWROOM");
                        System.out.println("9.} GO BACK TO MAIN MENU");
                        choice = mn.nextInt();}
                        else {choice = 9;
                            System.out.println("Enter choice other than 1\n Showroom capacity is full");}
                        break;

                    case 2:
                    if(employeeCount<500){
                        employee[employeeCount] = new Employee();
                        employee[employeeCount++].setDetails();
                        System.out.println();
                        System.out.println("2.} ADD NEW EMPLOYEE");
                        System.out.println("9.} GO BACK TO MAIN MENU");
                        choice = 0;
                        choice = mn.nextInt();}
                        else {choice = 9;
                            System.out.println("Enter choice other than 2\n Employee capacity is full");}                        break;

                    case 3:
                    if (carCount<1000) {
                        car[carCount] = new Cars();
                        car[carCount++].setDetails();
                        System.out.println();
                        System.out.println("3.} ADD NEW SHOWROOM");
                        System.out.println("9.} GO BACK TO MAIN MENU");
                        choice = mn.nextInt();}
                        else {choice = 9;
                            System.out.println("Enter choice other than 3\n Car capacity is full");}                        break;

                    case 4:
                        for (int i = 0; i < showroomCount; i++)
                            showroom[i].getDetails();
                        System.out.println("4.} GET NEW SHOWROOM DETAILS");
                        System.out.println("9.} GO BACK TO MAIN MENU");
                        choice = mn.nextInt();
                        break;

                    case 5:
                        for (int i = 0; i < employeeCount; i++)
                            employee[i].getDetails();
                        System.out.println("4.} GET NEW EMPLOYEE DETAILS");
                        System.out.println("9.} GO BACK TO MAIN MENU");
                        choice = mn.nextInt();
                        break;

                    case 6:
                        for (int i = 0; i < carCount; i++)
                            car[i].getDetails();
                        System.out.println("4.} GET NEW CAR DETAILS");
                        System.out.println("9.} GO BACK TO MAIN MENU");
                        choice = mn.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE");
                        choice = mn.nextInt();
                        break;
                }
            }
        }
        System.out.println("Thank You For Using C/M/S");
        mn.close();
    }
}
