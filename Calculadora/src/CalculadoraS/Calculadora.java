package CalculadoraS;

public class Calculadora {
	private double num1, num2;

	public Calculadora(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public Calculadora(String num1, String num2) {
		this.num1 = Double.parseDouble(num1);
		this.num2 = Double.parseDouble(num2);
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
	
	public double sumar(double num1, double num2) {
        return num1 + num2;
    }
	
	public double sumar() {
        return this.num1 + this.num2;
    }
	
    public double restar(double num1, double num2) {
        return num1 - num2;
    }
    
    public double restar() {
        return this.num1 - this.num2;
    }

    public double multiplicar(double num1, double nom2) {
        return num1 * num2;
    }
    
    public double multiplicar() {
        return this.num1 * this.num2;
    }
    
    public double dividir(double num1, double num2) {
        return num1 / num2;
    }
	
    public double dividir() {
        return this.num1 / this.num2;
    }
    
}
