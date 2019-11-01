public class Terning {

    private final int MAX = 6;
    private int faceValue;

    public Terning(int faceValue) {
        this.faceValue = faceValue;
    }
    public int roll() {
        faceValue = (int) (Math.random() * MAX) + 1;
        return faceValue;
    }
}
