package tasck_03;

public class Country {

    private String name;
    private int size;
    private int area;
    private String capital;
    private boolean accessToTheSea;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getArea() {
        return area;
    }

    public String getCapital() {
        return capital;
    }

    public boolean isAccessToTheSea() {
        return accessToTheSea;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setAccessToTheSea(boolean accessToTheSea) {
        this.accessToTheSea = accessToTheSea;
    }

}
