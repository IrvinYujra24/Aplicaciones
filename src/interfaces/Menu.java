package interfaces;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Menu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalculadora = new JButton("");
		btnCalculadora.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MiCalculadora calculadora=new MiCalculadora();
				calculadora.setVisible(rootPaneCheckingEnabled);
			}
		});
		btnCalculadora.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/sector5.png")));
		btnCalculadora.setBounds(42, 56, 128, 128);
		contentPane.add(btnCalculadora);
		
		JButton btnAdivinar = new JButton("");
		btnAdivinar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Adivina adiv=new Adivina();
				adiv.setVisible(rootPaneCheckingEnabled);
			}
		});
		btnAdivinar.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/sector8.png")));
		btnAdivinar.setBounds(42, 230, 128, 128);
		contentPane.add(btnAdivinar);
		
		JButton btnNotepad = new JButton("");
		btnNotepad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				notepad nota=new notepad();
				nota.setVisible(rootPaneCheckingEnabled);
			}
		});
		btnNotepad.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/sector6.png")));
		btnNotepad.setBounds(180, 56, 128, 128);
		contentPane.add(btnNotepad);
		
		JButton btnPokemon = new JButton("");
		btnPokemon.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/sector3.png")));
		btnPokemon.setBounds(180, 230, 128, 128);
		contentPane.add(btnPokemon);
		
		JButton btnLista = new JButton("");
		btnLista.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/sector7.png")));
		btnLista.setBounds(318, 56, 128, 128);
		contentPane.add(btnLista);
		
		JButton btnAventura = new JButton("");
		btnAventura.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/sector4.png")));
		btnAventura.setBounds(318, 230, 128, 128);
		contentPane.add(btnAventura);
		
		JButton btnConversor = new JButton("");
		btnConversor.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/sector2.png")));
		btnConversor.setBounds(456, 56, 128, 128);
		contentPane.add(btnConversor);
		
		JButton btnConversorB = new JButton("");
		btnConversorB.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/sector1.png")));
		btnConversorB.setBounds(456, 230, 128, 128);
		contentPane.add(btnConversorB);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(68, 195, 81, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNotepad = new JLabel("Notepad");
		lblNotepad.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotepad.setBounds(205, 195, 81, 14);
		contentPane.add(lblNotepad);
		
		JLabel lblListaDeTareas = new JLabel("LIsta de Tareas");
		lblListaDeTareas.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeTareas.setBounds(343, 195, 81, 14);
		contentPane.add(lblListaDeTareas);
		
		JLabel lblConversorDeMoneda = new JLabel("Conversor de moneda");
		lblConversorDeMoneda.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversorDeMoneda.setBounds(456, 195, 128, 14);
		contentPane.add(lblConversorDeMoneda);
		
		JLabel lblAdivinarNmero = new JLabel("Adivinar número");
		lblAdivinarNmero.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdivinarNmero.setBounds(68, 369, 81, 14);
		contentPane.add(lblAdivinarNmero);
		
		JLabel lblRelojDigital = new JLabel("Que pokemon eres?");
		lblRelojDigital.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelojDigital.setBounds(180, 369, 128, 14);
		contentPane.add(lblRelojDigital);
		
		JLabel lblAventura = new JLabel("Aventura");
		lblAventura.setHorizontalAlignment(SwingConstants.CENTER);
		lblAventura.setBounds(343, 369, 81, 14);
		contentPane.add(lblAventura);
		
		JLabel lblConversorDeBases = new JLabel("Conversor de Bases");
		lblConversorDeBases.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversorDeBases.setBounds(456, 369, 128, 14);
		contentPane.add(lblConversorDeBases);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(245, 11, 137, 23);
		contentPane.add(lblNewLabel_1);
	}
}
