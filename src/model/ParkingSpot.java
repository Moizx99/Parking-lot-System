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
    this.parkedVehicle = parkedVehicle;
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
}
