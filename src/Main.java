import model.ParkingLot;
import model.ParkingSpot;
import model.Vehicle;
import model.VehicleType;

public class Main {
  public static void main(String[] args) {

    ParkingLot parkingLot = new ParkingLot(4, 6, 5);

    Vehicle car = new Vehicle(
            "ABC-123",
            "John",
            VehicleType.CAR
    );

    Vehicle secondCar = new Vehicle(
            "XYZ-999",
            "Mike",
            VehicleType.CAR
    );

    parkingLot.parkVehicle(car);
    parkingLot.parkVehicle(secondCar);

    parkingLot.removeVehicle("ABC-123");

    ParkingSpot foundSpot =
            parkingLot.findVehicleSpot("XYZ-999");

    System.out.println("Vehicle found at:");
    System.out.println(foundSpot);

    System.out.println("\nAll parking spots:");

    for (ParkingSpot spot : parkingLot.getParkingSpots()) {
      System.out.println(spot);
    }

  }
}
