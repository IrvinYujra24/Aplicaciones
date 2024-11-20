package clases;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import interfaces.Adivina;

public class valor {
	private int valor;
	private int limite_inferior;
	private int limite_superior;
	private int intentos;
	public valor() {
		// TODO Auto-generated constructor stub
	}
	public valor(int valor, int limite_inferior, int limite_superior, int intentos) {
		super();
		this.valor = valor;
		this.limite_inferior = limite_inferior;
		this.limite_superior = limite_superior;
		this.intentos = intentos;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getLimite_inferior() {
		return limite_inferior;
	}
	public void setLimite_inferior(int limite_inferior) {
		this.limite_inferior = limite_inferior;
	}
	public int getLimite_superior() {
		return limite_superior;
	}
	public void setLimite_superior(int limite_superior) {
		this.limite_superior = limite_superior;
	}
	public int getIntentos() {
		return intentos;
	}
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
	public void generar(int li,int ls) {
		int n=0;
		this.setLimite_inferior(li);
		this.setLimite_superior(ls);
		n=(int)(Math.random()*ls)+li;
		this.valor=n;
	}
	public void evaluar(JTextField numero,JLabel resultado, JButton btnArriba, JButton btnAbajo) {
		int entrada=Integer.parseInt(numero.getText());
		if(this.valor==entrada) {
			resultado.setIcon(new ImageIcon(Adivina.class.getResource("/imagenes/icons8_Checkmark_42px.png")));
			
		}else {
			
			resultado.setIcon(new ImageIcon(Adivina.class.getResource("/imagenes/icons8_Cancel_42px.png")));
			if(this.valor<entrada) {
				btnArriba.setVisible(false);
				btnAbajo.setVisible(true);
			}else {
				btnArriba.setVisible(true);
				btnAbajo.setVisible(false);
			}
		}
	}
}
