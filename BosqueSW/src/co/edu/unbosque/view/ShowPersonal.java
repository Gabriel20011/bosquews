package co.edu.unbosque.view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

import co.edu.unbosque.model.Personal;

public class ShowPersonal extends JFrame {
	
	private JLabel lblcedula;
	private JLabel lblnombre;
	private JLabel lblapellido;
	private JLabel lblgenero;
	private JLabel lbltelefono;
	private JLabel lblcorreo;
	private JLabel lbldireccion;
	private JLabel lblanio;
	
	private JLabel lbllevel;
	private JLabel lblnventas;
	private JLabel venta;
	
	private JLabel txtnombre;
	private JLabel txtcedula;
	private JLabel txtapellido;
	private JLabel txtcorreo;
	private JLabel txttelefono;
	private JLabel txtdireccion;
	private JLabel txtnventas;
	
	private MainWindow principal;
	private Personal personal;
	
	public ShowPersonal(MainWindow principal) {
		this.principal = principal;
		setSize(600,500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
	}
	
	public void cargarInformacion(Personal personal) {
		this.personal = personal;
	}

}
