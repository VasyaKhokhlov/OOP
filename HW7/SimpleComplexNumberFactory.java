package HW7;

public class SimpleComplexNumberFactory implements ComplexNumberFactory {
    public ComplexNumber createComplexNumber(double realPart, double imaginaryPart) {
        return new SimpleComplexNumber(realPart, imaginaryPart);
    }
}