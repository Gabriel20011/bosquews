package co.edu.unbosque.view;

import java.awt.Color;
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
	public JList<E>lista;
	JLabel lblnombre;
	private DefaultListModel<E> modelo;
	public JScrollPane scrolllista;
	

	public MainWindow() {
	setTitle("Main Window");
	setSize(1000,600);
	setResizable(false);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	getContentPane().setBackground(Color.white);
	getContentPane().setLayout(null);
	
	lblnombre = new JLabel("Logooooo");
	lblnombre.setBounds(100,100,100,100);
	getContentPane().add(lblnombre);
	

	btnveringenieros = new JButton("Ver Ingenieros");
	btnveringenieros.setBounds(50,260,150,30);
	getContentPane().add(btnveringenieros);
	btnveringenieros.addActionListener(this);

	btnvercomision = new JButton("Ver Comision");
	btnvercomision.setBounds(50,340,150,30);
	getContentPane().add(btnvercomision);
	btnvercomision.addActionListener(this);

	btnagregar = new JButton("Agregar Ingeniero");
	btnagregar.setBounds(50,420,150,30);
	getContentPane().add(btnagregar);
	btnagregar.addActionListener(this);
	
	btncalcular = new JButton("Calcular Salario");
	btncalcular.setBounds(50,500,150,30);
	getContentPane().add(btncalcular);
	btncalcular.addActionListener(this);
	// TODO Auto-generated constructor stub
	lista= new JList<E>();
	lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	getContentPane().add(lista);
	modelo = new DefaultListModel<E>();
	scrolllista = new JScrollPane();
	scrolllista.setBounds(300,100,525,450);
	scrolllista.setViewportView(lista);
	getContentPane().add(scrolllista);
	
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

	


