package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.valor;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Adivina extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tbxNumero;
	public static valor v=new valor();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adivina frame = new Adivina();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Adivina() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADIVINA EL NÚMERO");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(92, 11, 235, 28);
		contentPane.add(lblNewLabel);
		
		tbxNumero = new JTextField();
		tbxNumero.setFont(new Font("Century Gothic", Font.BOLD, 30));
		tbxNumero.setHorizontalAlignment(SwingConstants.CENTER);
		tbxNumero.setBounds(176, 97, 80, 80);
		contentPane.add(tbxNumero);
		tbxNumero.setColumns(10);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setIcon(new ImageIcon(Adivina.class.getResource("/imagenes/icons8_help_42px.png")));
		lblResultado.setBounds(194, 191, 45, 45);
		contentPane.add(lblResultado);
		
		JButton btnNumero = new JButton("");
		btnNumero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				v.generar(1, 20);
				tbxNumero.setText(v.getValor()+"");
			}
		});
		btnNumero.setIcon(new ImageIcon(Adivina.class.getResource("/imagenes/icons8_question_mark_75px.png")));
		btnNumero.setBounds(48, 97, 80, 80);
		contentPane.add(btnNumero);
		
		
		JButton btnArriba = new JButton("");
		btnArriba.setIcon(new ImageIcon(Adivina.class.getResource("/imagenes/icons8_up_squared_45px.png")));
		btnArriba.setBounds(48, 191, 45, 45);
		btnArriba.setVisible(false);
		contentPane.add(btnArriba);
		
		JButton btnAbajo = new JButton("");
		btnAbajo.setIcon(new ImageIcon(Adivina.class.getResource("/imagenes/icons8_drop_down_45px.png")));
		btnAbajo.setBounds(339, 191, 45, 45);
		btnAbajo.setVisible(false);
		contentPane.add(btnAbajo);

		JButton btnAdivina = new JButton("");
		btnAdivina.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				v.evaluar(tbxNumero, lblResultado, btnArriba, btnAbajo);
			}
		});
		btnAdivina.setIcon(new ImageIcon(Adivina.class.getResource("/imagenes/sector8.png")));
		btnAdivina.setBounds(304, 97, 80, 80);
		contentPane.add(btnAdivina);
	}

}
