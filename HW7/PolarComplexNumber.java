package HW7;

public class PolarComplexNumber implements ComplexNumber {
    private double magnitude;
    private double phase;

    public PolarComplexNumber(double magnitude, double phase) {
        this.magnitude = magnitude;
        this.phase = phase;
    }

    public double getRealPart() {
        return magnitude * Math.cos(phase);
    }

    public double getImaginaryPart() {
        return magnitude * Math.sin(phase);
    }
}
