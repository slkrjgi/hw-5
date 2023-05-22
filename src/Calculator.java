
public class Calculator {

    private double firstValue;
    private double secondValue;
    private double result;

    public Calculator () {

    }

    public Calculator (double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public double getFirstValue() {
        return this.firstValue;
    }

    public double getSecondValue() {
        return this.secondValue;
    }

    public double Add() {
        this.result = this.firstValue + this.secondValue;
        return this.result;
    }

    public double Subtract () {
        this.result = this.firstValue - this.secondValue;
        return this.result;
    }

    public double Multiply() {
        this.result = this.firstValue * this.secondValue;
        return this.result;
    }

    public double Divide() {
        this.result = this.firstValue / this.secondValue;
        return this.result;
    }

}
