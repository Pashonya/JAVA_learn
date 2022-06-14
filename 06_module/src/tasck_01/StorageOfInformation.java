package tasck_01;

public class StorageOfInformation {

    private final typeStorageOfInformation type;
    private final int memoryCapacity;
    private final double weight;



    public StorageOfInformation (typeStorageOfInformation type, int memoryCapacity, double weight) {
        this.type = type;
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
    }

    public  typeStorageOfInformation getType() {
        return type;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public double getWeight() {
        return weight;
    }



    public String toString () {
        return "Накопитель информации: " + " тип " + type  + ", объем памяти "  + memoryCapacity + " Тб," + " вес " + weight + " кг.";
    }
}
