import java.util.Scanner;

public class Cars extends Showroom implements Utility{
    String carName;
    String carModel;
    String carColor;
    String carFuelType;
    String carType;
    String cStringarType;
    String carTransmission;
    int carPrice;

    public void getDetails(){
        System.out.println("=====================================");
        System.out.println("Car Name: " + carName);
        System.out.println("carModel: " + carModel);
        System.out.println("Car Color: " + carColor);
        System.out.println("CarFuelType: " + carFuelType);
        System.out.println("CarType: " + carType);
        System.out.println("CarTransmission: " + carTransmission);
        System.out.println("carPrice: " + carPrice);
        System.out.println("=====================================");
    }
    public void setDetails(){
        Scanner c = new Scanner(System.in);
        System.out.print("Enter Car Name");
        carName = c.nextLine();
        System.out.print("Enter Car Model");
        carModel = c.nextLine();
        System.out.print("Enter Car Color");
        carColor = c.nextLine();
        System.out.print("Enter Car Car Fuel Type");
        carFuelType = c.nextLine();
        System.out.print("Enter Car Car Type");
        carType = c.nextLine();
        System.out.print("Enter Car Car Transmission");
        carTransmission = c.nextLine();
        System.out.print("Enter Car Car Price");
        carPrice = c.nextInt();
        totalCarInStock++;
        
    }
}
