public class SimpleCalculator {

    private double first;
    private double second;

    public SimpleCalculator() {
        first = 0;
        second = 0;
    }

    public SimpleCalculator(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public double add() {
        return first + second;
    }

    public double subtract() {
        return first - second;
    }

    public double multiply() {
        return first * second;
    }

    public double divide() {
        return (double) first / second;
    }

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

}
