package tasck_02;

public class Arithmetic {
    public int x;
    public int y;

    public Arithmetic(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sum() {
        return this.x + this.y;
    }

    public int multiplication() {
        return this.x * this.y;
    }

    public int max() {
        return this.x > this.y ? this.x : this.y;
    }

    public int min() {
        return this.x < this.y ? this.x : this.y;
    }
}
