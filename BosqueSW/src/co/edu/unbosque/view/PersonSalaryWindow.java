package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PersonSalaryWindow extends JFrame implements ActionListener {
	public JButton btncomision;
	public JButton btnsalario;
	
		public PersonSalaryWindow() {
		
		setSize(400,500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		btncomision = new JButton("Ingeniero Senior");
		btncomision.setBounds(90,50,220,100);
		getContentPane().add(btncomision);
		btncomision.addActionListener(this);
		btncomision.setBackground(Color.lightGray);
		
		btnsalario = new JButton("Ingeniero Junior");
		btnsalario.setBounds(90,300,220,100);
		getContentPane().add(btnsalario);
		btnsalario.addActionListener(this);
		btnsalario.setBackground(Color.lightGray);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		EngineerWindow e = new EngineerWindow();
		e.setVisible(true);
	}

}
