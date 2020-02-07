package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle.Control;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import co.edu.unbosque.controller.Controller;

public class MainWindow extends JFrame implements ActionListener {


	private JButton btnveringenieros;
	private Controller controlador;
	private EngineerWindow pTiposIngenieros;
	private SalaryWindow pSalaryEnginieers;

	public MainWindow(Controller controlador) {
		this.controlador = controlador;
		intanciarPaneles();

		setTitle("Programacion");
		setSize(400,300);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(240,235,190));
		getContentPane().setLayout(null);


		btnveringenieros = new JButton("Ver Ingenieros");
		btnveringenieros.setForeground(new Color(240,235,190));
		btnveringenieros.setBackground(new Color(50, 30, 24));
		btnveringenieros.setBounds(100,200,200,50);
		btnveringenieros.setFont(new Font("Lucida Calligraphy", Font.TRUETYPE_FONT,14));
		getContentPane().add(btnveringenieros);
		btnveringenieros.addActionListener(this);


	}
	public void intanciarPaneles() {
		pTiposIngenieros = new EngineerWindow(this);
		pSalaryEnginieers = new SalaryWindow(this);
	}
	public void ocultarPaneles() {
		pTiposIngenieros.setVisible(false);
		pSalaryEnginieers.setVisible(false);
	}

	public JButton getBtnveringenieros() {
		return btnveringenieros;
	}


	public void actionPerformed(ActionEvent e) {
		String accion = e.getActionCommand();
		if (accion == "Ver Ingenieros") {
			setVisible(false);
			pTiposIngenieros.setVisible(true);
		}
		if (accion == "Menu") {
			ocultarPaneles();
			setVisible(true);
		}
		if (accion == "Ingeniero por Comision") {
			pTiposIngenieros.setVisible(false);

		}
		if (accion == "Ingeniero por Salario") {
			pTiposIngenieros.setVisible(false);
			pSalaryEnginieers.setVisible(true);

		}

	}
}




