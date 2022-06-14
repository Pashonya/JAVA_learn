package tasck_01;

public class Keyboard {


    private final String type;
    private final String highlights;
    private final double weight;

    public Keyboard(String type, String highlights, double weight) {
        this.type = type;
        this.highlights = highlights;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public String isHighlights() {
        return highlights;
    }

    public double getWeight() {
        return weight;
    }

    public String toString () {
        return "Клавиатура: " + "тип - " + type  + ", подсветка -" + highlights + ", вес " + weight + " кг.";
    }
}
