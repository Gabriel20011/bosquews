package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EngineerWindow extends JFrame{
	
	private JButton btncomision;
	private JButton btnsalario;
	private JButton menu;
	
	public EngineerWindow(MainWindow principal) {
				setSize(225, 235);
		setResizable(false);
		setVisible(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setBackground(new Color(240,235,190));
		getContentPane().setLayout(null);
		addWindowListener(principal);
		
		btncomision = new JButton("Ingeniero por Comision");
		btncomision.setBounds(10,15,200,45);
		getContentPane().add(btncomision);
		btncomision.addActionListener(principal);
		btncomision.setBackground(new Color(50, 30, 24));
		btncomision.setForeground(new Color(240,235,190));
		
		btnsalario = new JButton("Ingeniero por Salario");
		btnsalario.setBounds(10,85,200,45);
		getContentPane().add(btnsalario);
		btnsalario.addActionListener(principal);
		btnsalario.setBackground(new Color(50, 30, 24));
		btnsalario.setForeground(new Color(240,235,190));
		
		menu = new JButton("Volver al menu");
		menu.setActionCommand("Menu");
		menu.setBounds(10,155,200,45);
		getContentPane().add(menu);
		menu.addActionListener(principal);
		menu.setBackground(new Color(50, 30, 24));
		menu.setForeground(new Color(240,235,190));
		
	}

}
