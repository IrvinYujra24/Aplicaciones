package clases;

import javax.swing.JLabel;

public class operacion {
	private double a;
	private double b;
	private double r;
	private String op;
	public operacion() {	
	}
	public operacion(int a, int b, double r, String op) {
		this.a = a;
		this.b = b;
		this.r = r;
		this.op = op;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public void realizar_operacion() {
		int a=(int)(this.getA());
		System.out.println("A"+a);
		int b=(int)(this.getB());
		System.out.println("B"+b);
		switch (this.getOp()) {
		case "+": {
			this.setR(a+b);
			break;
		}		
		}
	}
	public void realizar_operacion(double a, double b) {		
		switch (this.getOp()) {
		case "+": {
			this.setR(a+b);
			break;
		}		
		}
	}
	
	public void colocarTexto(JLabel resultado) {
	int texto=Integer.parseInt(resultado.getText());
	String a=(int)(this.getR())+"";
	if(texto!=0) {
		resultado.setText(texto+a+"");
	}else {
		resultado.setText(a+"");
	}
	}
}
