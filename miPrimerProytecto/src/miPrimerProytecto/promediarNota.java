package miPrimerProytecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class promediarNota {

	private JFrame frame;
	private JTextField txttp1;
	private JTextField txttp2;
	private JTextField txttp3;
	private JTextField txtparcial;
	private JTextField txtpromedio;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					promediarNota window = new promediarNota();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public promediarNota() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPromedioDeNotas = new JLabel("                                  PROMEDIO DE NOTAS");
		lblPromedioDeNotas.setBounds(0, 0, 434, 17);
		lblPromedioDeNotas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPromedioDeNotas.setLabelFor(frame);
		lblPromedioDeNotas.setBackground(Color.CYAN);
		frame.getContentPane().add(lblPromedioDeNotas);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
	if(txttp1.getText().length()>0 && txttp2.getText().length()>0 && txttp3.getText().length()>0 && txtparcial.getText().length()>0){
				double nota1=Double.parseDouble(txttp1.getText());
				double nota2=Double.parseDouble(txttp2.getText());
				double nota3=Double.parseDouble(txttp3.getText());
				double nota4=Double.parseDouble(txtparcial.getText());
				
			    double resultado=(nota1+nota2+nota3+nota4)/4;
				
				txtpromedio.setText(Double.toString(resultado));
				
				if(resultado>=7)txtpromedio.setBackground(Color.GREEN);
				else txtpromedio.setBackground(Color.RED);
				 }
	else {
		JOptionPane.showMessageDialog(txtparcial, "complete todas las notas");
	}
			}
		});
		btnCalcular.setBounds(315, 193, 89, 31);
		frame.getContentPane().add(btnCalcular);
		
		txttp1 = new JTextField();
		txttp1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char validar=evt.getKeyChar();
				if(Character.isLetter(validar)) {
					evt.consume();
					JOptionPane.showMessageDialog(txtparcial, "la nota deve ser un numero");
				}
				
			}
		});
		txttp1.setBounds(182, 28, 86, 20);
		frame.getContentPane().add(txttp1);
		txttp1.setColumns(10);
		
		txttp2 = new JTextField();
		txttp2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char validar=evt.getKeyChar();
				if(Character.isLetter(validar)) {
					evt.consume();
					JOptionPane.showMessageDialog(txtparcial, "la nota deve ser un numero");
				}
			}
		});
		txttp2.setToolTipText("");
		txttp2.setBounds(182, 66, 86, 20);
		frame.getContentPane().add(txttp2);
		txttp2.setColumns(10);
		
		txttp3 = new JTextField();
		txttp3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char validar=evt.getKeyChar();
				if(Character.isLetter(validar)) {
					evt.consume();
					JOptionPane.showMessageDialog(txtparcial, "la nota deve ser un numero");
				}
			}
		});
		txttp3.setBounds(182, 109, 86, 20);
		frame.getContentPane().add(txttp3);
		txttp3.setColumns(10);
		
		txtparcial = new JTextField();
		txtparcial.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char validar=evt.getKeyChar();
				if(Character.isLetter(validar)) {
					evt.consume();
					JOptionPane.showMessageDialog(txtparcial, "la nota deve ser un numero");
				}
			}
		});
		txtparcial.setForeground(Color.BLACK);
		txtparcial.setBounds(182, 154, 86, 20);
		frame.getContentPane().add(txtparcial);
		txtparcial.setColumns(10);
		
		txtpromedio = new JTextField();
		txtpromedio.setForeground(Color.BLACK);
		txtpromedio.setBounds(182, 198, 86, 20);
		frame.getContentPane().add(txtpromedio);
		txtpromedio.setColumns(10);
		
		JLabel lblTp = new JLabel("Nota 1\u00BA  TP");
		lblTp.setBounds(60, 31, 73, 14);
		frame.getContentPane().add(lblTp);
		
		JLabel lbltp = new JLabel("Nota 2\u00BA  TP");
		lbltp.setBounds(60, 69, 73, 14);
		frame.getContentPane().add(lbltp);
		
		JLabel lblTp_1 = new JLabel("Nota 3\u00BA  TP");
		lblTp_1.setBounds(60, 112, 73, 14);
		frame.getContentPane().add(lblTp_1);
		
		JLabel lblParcial = new JLabel("Nota Parcial");
		lblParcial.setBounds(60, 157, 73, 14);
		frame.getContentPane().add(lblParcial);
		
		JLabel lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(87, 201, 46, 14);
		frame.getContentPane().add(lblPromedio);
	}
}
