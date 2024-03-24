package HW_7;

public class DivisionOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя");
        }
        return num1 / num2;
    }
}
