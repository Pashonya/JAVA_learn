package tasck_04;

public class Cats {



    private String name;
    private int age;
    private String coloring;

    public Cats(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColoring() {
        return coloring;
    }

    public void setColoring(String coloring) {
        this.coloring = coloring;
    }

}
