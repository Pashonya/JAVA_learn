package tasck_02;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(0.5,0.5,1);
        CargoInformation cargoInformation = new CargoInformation(10,
                "Савушкина 126 Б", dimensions, "88005553535",
                false, true);
        cargoInformation.setWeight(111);
        System.out.println(cargoInformation);
    }
}
