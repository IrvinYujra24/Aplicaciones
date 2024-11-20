package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
//import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import clases.*;

public class MiCalculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	static operacion ope= new operacion();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiCalculadora frame = new MiCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//	public static void colocarTexto(JLabel resultado,String valor) {
//		String texto=resultado.getText();
//		if(texto!="0") {
//			resultado.setText(texto+valor);
//		}else {
//			resultado.setText(valor);
//		}
//	}
	public static void operacion(JLabel resultado, String op) {
		
		ope.setA(Integer.parseInt(resultado.getText()));
		ope.setOp(op);
		resultado.setText("0");
	}
	/**
	 * Create the frame.
	 */
	public MiCalculadora() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 330, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResultado = new JLabel("0");
		lblResultado.setBackground(SystemColor.textText);
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultado.setBounds(10, 11, 294, 49);
		contentPane.add(lblResultado);
		
		JButton btn1 = new JButton("");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				//colocarTexto(lblResultado, "1");
				ope.setR(1);
				ope.colocarTexto(lblResultado);
			}
		});
		btn1.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector9.png")));
		btn1.setBounds(14, 71, 60, 60);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ope.setR(2);
				ope.colocarTexto(lblResultado);
			}
		});
		btn2.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector10.png")));
		btn2.setBounds(88, 71, 60, 60);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ope.setR(3);
				ope.colocarTexto(lblResultado);
			}
		});
		btn3.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector11.png")));
		btn3.setBounds(162, 71, 60, 60);
		contentPane.add(btn3);
		
		
		
		JButton btn4 = new JButton("");
		btn4.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector13.png")));
		btn4.setBounds(14, 143, 60, 60);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector14.png")));
		btn5.setBounds(88, 143, 60, 60);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector15.png")));
		btn6.setBounds(162, 143, 60, 60);
		contentPane.add(btn6);
		
		JButton btnMenos = new JButton("");
		btnMenos.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector20.png")));
		btnMenos.setBounds(236, 143, 60, 60);
		contentPane.add(btnMenos);
		
		JButton btn7 = new JButton("");
		btn7.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector17.png")));
		btn7.setBounds(14, 214, 60, 60);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector18.png")));
		btn8.setBounds(88, 214, 60, 60);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector19.png")));
		btn9.setBounds(162, 214, 60, 60);
		contentPane.add(btn9);
		
		JButton btnProd = new JButton("");
		btnProd.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector16.png")));
		btnProd.setBounds(236, 214, 60, 60);
		contentPane.add(btnProd);
		
		JButton btn0 = new JButton("");
		btn0.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector21.png")));
		btn0.setBounds(14, 285, 60, 60);
		contentPane.add(btn0);
		
		JButton btnC = new JButton("");
		btnC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblResultado.setText("0");
			}
		});
		btnC.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector22.png")));
		btnC.setBounds(88, 285, 60, 60);
		contentPane.add(btnC);
		
		JButton btnIgual = new JButton("");
		btnIgual.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				//int a=ope.getA();
				int b=Integer.parseInt(lblResultado.getText());
				ope.setB(b);
				ope.realizar_operacion();
				lblResultado.setText(ope.getR()+"");
			}
		});
		btnIgual.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector23.png")));
		btnIgual.setBounds(162, 285, 60, 60);
		contentPane.add(btnIgual);
		
		JButton btnDiv = new JButton("");
		btnDiv.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector12.png")));
		btnDiv.setBounds(236, 285, 60, 60);
		contentPane.add(btnDiv);
		
		
		JButton btnMas = new JButton("");
		btnMas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operacion(lblResultado,"+");
			}
		});
		btnMas.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/sector24.png")));
		btnMas.setBounds(236, 71, 60, 60);
		contentPane.add(btnMas);
	}

}
