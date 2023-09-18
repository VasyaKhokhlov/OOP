package HW7;

public class SimpleComplexNumber implements ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public SimpleComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}
