package model;

public class Vehicle {

  private final String registrationNumber;
  private final String ownerName;
  private final VehicleType vehicleType;


  public Vehicle(String registrationNumber,
                 String ownerName,
                 VehicleType vehicleType) {

    this.registrationNumber = registrationNumber;
    this.ownerName = ownerName;
    this.vehicleType = vehicleType;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  @Override
  public String toString() {
    return registrationNumber +
            " (" + vehicleType + ")" +
            " Owner: " + ownerName;
  }

}
