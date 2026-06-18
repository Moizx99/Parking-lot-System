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

    // Park vehicles
    parkingLot.parkVehicle(car);
    parkingLot.parkVehicle(secondCar);

    // Remove first vehicle
    parkingLot.removeVehicle("ABC-123");

    // Find second vehicle
    ParkingSpot foundSpot =
            parkingLot.findVehicleSpot("XYZ-999");

    System.out.println("=== VEHICLE LOOKUP TEST ===");
    System.out.println("Vehicle found at:");
    System.out.println(foundSpot);

    System.out.println();

    System.out.println("=== AVAILABLE SPOTS TEST ===");

    System.out.println(
            "Available CAR spots: "
                    + parkingLot.getAvailableSpots(VehicleType.CAR)
    );

    System.out.println(
            "Available MOTORCYCLE spots: "
                    + parkingLot.getAvailableSpots(VehicleType.MOTORCYCLE)
    );

    System.out.println(
            "Available TRUCK spots: "
                    + parkingLot.getAvailableSpots(VehicleType.TRUCK)
    );

    System.out.println();

    System.out.println("=== ALL PARKING SPOTS ===");

    for (ParkingSpot spot : parkingLot.getParkingSpots()) {
      System.out.println(spot);
    }


    Vehicle car1 = new Vehicle(
            "ABC-123",
            "John",
            VehicleType.CAR
    );

    Vehicle duplicateCar = new Vehicle(
            "ABC-123",
            "Mike",
            VehicleType.CAR
    );

    parkingLot.parkVehicle(car1);
    parkingLot.parkVehicle(duplicateCar);

  }
}
