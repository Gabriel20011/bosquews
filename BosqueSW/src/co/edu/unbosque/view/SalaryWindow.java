package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SalaryWindow extends JFrame{
	
	private JButton btnveringenieroS;
	private JButton btnveringenieroJ;
	private JButton menu;
	private MainWindow principal;
	
	public SalaryWindow(MainWindow principal) {
		this.principal = principal;
		setSize(225, 235);
		setResizable(false);
		setVisible(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBackground(new Color(240,235,190));
		setLayout(null);
		
		btnveringenieroS = new JButton("Ingenieros Senior");
		btnveringenieroS.setForeground(new Color(240,235,190));
		btnveringenieroS.setBackground(new Color(50, 30, 24));
		btnveringenieroS.setBounds(10,15,200,45);
		btnveringenieroS.setFont(new Font("Lucida Calligraphy", Font.TRUETYPE_FONT,14));
		add(btnveringenieroS);
		btnveringenieroS.addActionListener(principal);
		
		btnveringenieroJ = new JButton("Ingenieros Junior");
		btnveringenieroJ.setForeground(new Color(240,235,190));
		btnveringenieroJ.setBackground(new Color(50, 30, 24));
		btnveringenieroJ.setBounds(10,85,200,45);
		btnveringenieroJ.setFont(new Font("Lucida Calligraphy", Font.TRUETYPE_FONT,14));
		add(btnveringenieroJ);
		btnveringenieroJ.addActionListener(principal);
		
		menu = new JButton("Menu");
		menu.setForeground(new Color(240,235,190));
		menu.setBackground(new Color(50, 30, 24));
		menu.setBounds(10,155,200,45);
		menu.setFont(new Font("Lucida Calligraphy", Font.TRUETYPE_FONT,14));
		add(menu);
		menu.addActionListener(principal);
		
	}

}
