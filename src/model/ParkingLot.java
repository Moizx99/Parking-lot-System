package model;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

  private List<ParkingSpot> parkingSpots;

  public ParkingLot(int carSpots,
                    int motorcycleSpots,
                    int truckSpots) {

    parkingSpots = new ArrayList<>();

    initializeSpots(carSpots, motorcycleSpots, truckSpots);
  }


  private void initializeSpots(int carSpots,
                               int motorcycleSpots,
                               int truckSpots) {

    int spotNumber = 1;

    // create car spots here
    for (int i = 0; i < carSpots; i++) {
      parkingSpots.add(new ParkingSpot(spotNumber, VehicleType.CAR));
      spotNumber++;
    }

    // create motorcycle spots here
    for (int i = 0; i < motorcycleSpots; i++) {
      parkingSpots.add(new ParkingSpot(spotNumber, VehicleType.MOTORCYCLE));
      spotNumber++;
    }

    // create truck spots here
    for (int i = 0; i < truckSpots; i++) {
      parkingSpots.add(new ParkingSpot(spotNumber, VehicleType.TRUCK));
      spotNumber++;
    }

  }

  public List<ParkingSpot> getParkingSpots() {
    return parkingSpots;
  }


  public void parkVehicle(Vehicle vehicle) {

    for (ParkingSpot spot : parkingSpots) {

      if (spot.getSpotType() == vehicle.getVehicleType()
              && !spot.isOccupied()) {

        spot.parkVehicle(vehicle);
        return;
      }
    }

    throw new IllegalStateException(
            "No available parking spot found for vehicle type: "
                    + vehicle.getVehicleType()
    );
  }


  public void removeVehicle(String registrationNumber) {

    for (ParkingSpot spot : parkingSpots) {

      if (spot.isOccupied()) {

        Vehicle vehicle = spot.getParkedVehicle();

        if (vehicle.getRegistrationNumber()
                .equals(registrationNumber)) {

          spot.removeVehicle();
          return;
        }
      }
    }

    throw new IllegalArgumentException(
            "Vehicle not found: " + registrationNumber
    );
  }


}
