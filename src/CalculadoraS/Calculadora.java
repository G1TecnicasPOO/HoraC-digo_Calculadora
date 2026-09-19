package CalculadoraS;

public class Calculadora {
	private double num1, num2;

	public Calculadora(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double sumar(double a, double b) {
        return num1 + num2;
    }

    public double restar(double a, double b) {
        return num1 - num2;
    }

    public double multiplicar(double a, double b) {
        return num1 * num2;
    }

    public double dividir(double a, double b) {
        return num1 / num2;
    }
	
}
