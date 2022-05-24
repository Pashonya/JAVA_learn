package tasck_02;

public class CargoInformation {
    private final double weight;
    private final Dimensions dimensions;
    private final String address;
    private final boolean turnOver;
    private final String registrationNumber;
    private final boolean fragile;


    public CargoInformation(double weight,
                            String address,
                            Dimensions dimensions,
                            String registrationNumber,
                            boolean turnOver,
                            boolean fragile) {
        this.weight = weight;
        this.address = address;
        this.registrationNumber = registrationNumber;

        this.dimensions = dimensions;
        this.turnOver = turnOver;
        this.fragile = fragile;
    }

    public CargoInformation setWeight(double weight) {
        return new CargoInformation(weight, address, dimensions,
                registrationNumber, turnOver, fragile);
    }
    public double getWeight() {
        return weight;
    }

    public CargoInformation setAddress(String address) {
        return new CargoInformation(weight, address, dimensions,
                registrationNumber, turnOver, fragile);
    }

    public String getAddress() {
        return address;
    }

    public CargoInformation setDimensions(Dimensions dimensions) {
        return new CargoInformation(weight, address, dimensions,
                registrationNumber, turnOver, fragile);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }




    public String toString() {
        return "вес " + weight + " кг" + "\n" + "адрес " + address + "\n" + dimensions +
                "\n" + "регистрационный номер " + registrationNumber;
    }
}
