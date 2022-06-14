package tasck_01;

public class Screen {

    private final int diagonal;
    private final typeScreen type;
    private final double weight;


    public Screen(int diagonal, typeScreen type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public typeScreen getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public String toString () {
        return "Экран: " + "диагональ " + diagonal  + ", тип - " + type + ", вес " + weight + " кг.";
    }
}
