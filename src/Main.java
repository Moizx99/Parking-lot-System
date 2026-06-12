import model.ParkingLot;
import model.ParkingSpot;
import model.Vehicle;
import model.VehicleType;

public class Main {
  public static void main(String[] args) {

    ParkingLot parkingLot = new ParkingLot(4,6, 5);

    for (ParkingSpot spot : parkingLot.getParkingSpots()){
      System.out.println(spot);
    }


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


    for (ParkingSpot spot : parkingLot.getParkingSpots()) {
      System.out.println(spot);
    }

  }
}
