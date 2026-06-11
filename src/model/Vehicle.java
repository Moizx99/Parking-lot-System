package model;

public class Vehicle {

  private String registrationNumber;                    // Registration Number: ABC-123
  private String ownerName;                             // John
  private VehicleType vehicleType;                      // Car


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


}
