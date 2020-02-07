package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MainWindow<E> extends JFrame implements ActionListener {
	
	
	public JButton btnveringenieros;
	public JButton btnvercomision;
	public JButton btnagregar;
	public JButton btncalcular;
	private DefaultListModel<E> modelo;
	public JScrollPane scrolllista;
	

	public MainWindow() {
	setTitle("Main Window");
	setSize(1000,600);
	setResizable(false);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	getContentPane().setBackground(new Color(240,235,190));
	getContentPane().setLayout(null);
	

	btnveringenieros = new JButton("Ver Ingenieros");
	btnveringenieros.setForeground(new Color(240,235,190));
	btnveringenieros.setBackground(new Color(50, 30, 24));
	btnveringenieros.setBounds(50,212,190,43);
	btnveringenieros.setFont(new Font("Lucida Calligraphy", Font.TRUETYPE_FONT,14));
	getContentPane().add(btnveringenieros);
	btnveringenieros.addActionListener(this);

	btnvercomision = new JButton("Ver Comision");
	btnvercomision.setBounds(50,285,190,43);
	btnvercomision.setBackground(new Color(50, 30, 24));
	btnvercomision.setForeground(new Color(240,235,190));
	btnvercomision.setFont(new Font("Lucida Calligraphy",  Font.ROMAN_BASELINE, 14));
	getContentPane().add(btnvercomision);
	btnvercomision.addActionListener(this);

	btnagregar = new JButton("Agregar Ingeniero");
	btnagregar.setBounds(50,360,190,43);
	btnagregar.setBackground(new Color(50, 30, 24));
	btnagregar.setForeground(new Color(240,235,190));
	btnagregar.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 14));
	getContentPane().add(btnagregar);
	btnagregar.addActionListener(this);
	
	btncalcular = new JButton("Calcular Salario");
	btncalcular.setBounds(50,427,190,43);
	btncalcular.setBackground(new Color(50, 30, 24));
	btncalcular.setForeground(new Color(240,235,190));
	btncalcular.setFont(new Font("Lucida Calligraphy",  Font.ROMAN_BASELINE, 14));
	getContentPane().add(btncalcular);
	btncalcular.addActionListener(this);
	
	JList<?> laLista = new JList();
	laLista.setEnabled(true);
	laLista.setBounds(330, 80, 405, 390);
	getContentPane().add(laLista);
	

	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	


	// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		MainWindow mw = new MainWindow();
		mw.setVisible(true);
	}
}

	


