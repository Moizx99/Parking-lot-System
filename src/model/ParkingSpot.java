package model;

public class ParkingSpot {

  private int spotNumber;
  private VehicleType spotType;
  private boolean occupied;
  private Vehicle parkedVehicle;

  public ParkingSpot(int spotNumber, VehicleType spotType) {
    this.spotNumber = spotNumber;
    this.spotType = spotType;
    this.occupied = false;
  }

  public int getSpotNumber() {
    return spotNumber;
  }

  public VehicleType getSpotType() {
    return spotType;
  }

  public boolean isOccupied() {
    return occupied;
  }

  public Vehicle getParkedVehicle() {
    return parkedVehicle;
  }

  public void parkVehicle(Vehicle vehicle) {

    if (occupied) {
      throw new IllegalStateException("Parking spot is already occupied.");
    }

    if (vehicle.getVehicleType() != spotType) {
      throw new IllegalArgumentException(
              "Vehicle type does not match parking spot type."
      );
    }

    occupied = true;
    parkedVehicle = vehicle;

  }

  public void removeVehicle() {

    if (!occupied) {
      throw new IllegalStateException("Parking spot is already empty.");
    }

    occupied = false;
    parkedVehicle = null;

  }


  @Override
  public String toString() {
    return "Spot Number: " + spotNumber +
            ", Type: " + spotType +
            ", Occupied: " + occupied;
  }
}
