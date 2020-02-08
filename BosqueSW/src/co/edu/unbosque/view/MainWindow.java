package co.edu.unbosque.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import co.edu.unbosque.controller.Controller;

public class MainWindow extends JFrame implements ActionListener {


	private JButton btnveringenieros;
	private Controller controlador;
	private EngineerWindow pTiposIngenieros;
	private SalaryWindow pSalaryEnginieers;
	private AddEngineerSenior aEngineerSenior;
	private AddEnginerJunior aEnginnerJunior;
	private AddPersonalComission aPersonalComission;
	private ListaPersonal listaPersonal;
	
	public MainWindow(Controller controlador) {
		this.controlador = controlador;
		intanciarPaneles();

		setTitle("Programacion");
		setSize(400,300);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(new Color(240,235,190));
		setLayout(null);

		btnveringenieros = new JButton("Ver Ingenieros");
		btnveringenieros.setForeground(new Color(240,235,190));
		btnveringenieros.setBackground(new Color(50, 30, 24));
		btnveringenieros.setBounds(100,200,200,50);
		btnveringenieros.setFont(new Font("Lucida Calligraphy", Font.TRUETYPE_FONT,14));
		add(btnveringenieros);
		btnveringenieros.addActionListener(this);
	}
	public void intanciarPaneles() {
		pTiposIngenieros = new EngineerWindow(this);
		pSalaryEnginieers = new SalaryWindow(this);
		aEngineerSenior = new AddEngineerSenior(this);
		aEnginnerJunior = new AddEnginerJunior(this);
		aPersonalComission = new AddPersonalComission(this);
		listaPersonal = new ListaPersonal(this);
		aPersonalComission = new AddPersonalComission(this);
	}
	public void ocultarPaneles() {
		pTiposIngenieros.setVisible(false);
		pSalaryEnginieers.setVisible(false);
		aEngineerSenior.setVisible(false);
		aEnginnerJunior.setVisible(false);
		aPersonalComission.setVisible(false);
		listaPersonal.setVisible(false);
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
			listaPersonal.iniciarBotones("Comission");
			listaPersonal.setVisible(true);
		}
		if (accion == "Ingeniero por Salario") {
			pTiposIngenieros.setVisible(false);
			pSalaryEnginieers.setVisible(true);
		}
		if( accion == "Ingenieros Senior") {
			pSalaryEnginieers.setVisible(false);
			listaPersonal.iniciarBotones("Senior");
			listaPersonal.setVisible(true);
		}
		if(accion == "Ingenieros Junior") {
			pSalaryEnginieers.setVisible(false);
			listaPersonal.iniciarBotones("Junior");
			listaPersonal.setVisible(true);
		}
		if(accion == "agregar Senior") {
			if(aEngineerSenior.getTxtnombre().getText().length()!=0 && aEngineerSenior.getTxtapellido().getText().length()!=0 
					&& aEngineerSenior.getTxtcedula().getText().length()!=0 && aEngineerSenior.getTxtcorreo().getText().length()!=0
					&& aEngineerSenior.getTxtdireccion().getText().length()!=0 && aEngineerSenior.getTxtnventas().getText().length()!=0) {

				int anio = (int) aEngineerSenior.getComboAnio().getSelectedItem();
				char genero = (char) aEngineerSenior.getComboGenero().getSelectedIndex();
				controlador.agregarSenior(aEngineerSenior.getTxtcedula().getText(), aEngineerSenior.getTxtnombre().getText(),
						aEngineerSenior.getTxtapellido().getText(), genero, aEngineerSenior.getTxttelefono().getText(),
						0, aEngineerSenior.getTxtcorreo().getText(), aEngineerSenior.getTxtdireccion().getText(),
						anio, Integer.parseInt(aEngineerSenior.getTxtnventas().getText()));

				controlador.converger();
				
			}
			else {
				JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE BIEN LOS DATOS");
			}
		}
		if(accion == "agregar Junior") {
			if(aEnginnerJunior.getTxtnombre().getText().length()!=0 && aEnginnerJunior.getTxtapellido().getText().length()!=0 
					&& aEnginnerJunior.getTxtcedula().getText().length()!=0 && aEnginnerJunior.getTxtcorreo().getText().length()!=0
					&& aEnginnerJunior.getTxtdireccion().getText().length()!=0 && aEnginnerJunior.getTxtcedula().getText().matches("[0-9]+") 
					&& aEnginnerJunior.getTxtapellido().getText().contains("[a-zA-Z]+") && aEnginnerJunior.getTxtnombre().getText().contains("[a-zA-Z]+")) {

				int anio = (int) aEnginnerJunior.getComboAnio().getSelectedItem();
				char genero = (char) aEnginnerJunior.getComboGenero().getSelectedIndex();
				int level = (int) aEnginnerJunior.getComboNivel().getSelectedItem();
				controlador.agregarJunior(aEnginnerJunior.getTxtcedula().getText(), aEnginnerJunior.getTxtnombre().getText(),
						aEnginnerJunior.getTxtapellido().getText(), genero, aEnginnerJunior.getTxttelefono().getText(),0, aEnginnerJunior.getTxtcorreo().getText(),
						aEnginnerJunior.getTxtdireccion().getText(), anio, level);

				controlador.converger();
			}else {
				JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE BIEN LOS DATOS");
			}
		}
		if(accion == "agregar Comission") {
			if(aPersonalComission.getTxtnombre().getText().length()!=0 && aPersonalComission.getTxtapellido().getText().length()!=0 
					&& aPersonalComission.getTxtcedula().getText().length()!=0 && aPersonalComission.getTxtcorreo().getText().length()!=0
					&& aPersonalComission.getTxtdireccion().getText().length()!=0 && 
					 aPersonalComission.getTxtventa().getText().length()!=0) {
				int anio = (int) aPersonalComission.getComboAnio().getSelectedItem();
				char genero = (char) aPersonalComission.getComboGenero().getSelectedIndex();
				controlador.agregarComission(aPersonalComission.getTxtcedula().getText(), aPersonalComission.getTxtnombre().getText(), aPersonalComission.getTxtapellido().getText(),
						genero, aPersonalComission.getTxttelefono().getText(), 0, aPersonalComission.getTxtcorreo().getText(), aPersonalComission.getTxtdireccion().getText(),
						anio, Double.parseDouble(aPersonalComission.getTxtventa().getText()));
				aPersonalComission.getTxtapellido().setText("");
				aPersonalComission.getTxtnombre().setText("");
				aPersonalComission.getTxtcedula().setText("");
				aPersonalComission.getTxtdireccion().setText("");
				aPersonalComission.getTxtcorreo().setText("");
				aPersonalComission.getTxttelefono().setText("");
				aPersonalComission.getTxtventa().setText("");
			}else {
				JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE BIEN LOS DATOS");
			}
		}
		if (accion == "AgregarComission") {
			listaPersonal.setVisible(false);
			aPersonalComission.setVisible(true);
		}
		if (accion == "AgregarSenior") {
			listaPersonal.setVisible(false);
			aEngineerSenior.setVisible(true);
		}
		if (accion == "AgregarJunior") {
			listaPersonal.setVisible(false);
			aEnginnerJunior.setVisible(true);
		}
	}
	public Controller getControlador() {
		return controlador;
	}
}