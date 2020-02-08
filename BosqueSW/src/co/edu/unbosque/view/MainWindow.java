package co.edu.unbosque.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

import co.edu.unbosque.controller.Controller;

import co.edu.unbosque.model.Personal;


public class MainWindow extends JFrame implements ActionListener, WindowListener {


	private JButton btnveringenieros;
	private Controller controlador;
	private EngineerWindow pTiposIngenieros;
	private SalaryWindow pSalaryEnginieers;
	private AddEngineerSenior aEngineerSenior;
	private AddEnginerJunior aEnginnerJunior;
	private AddPersonalComission aPersonalComission;
	private ListaPersonal listaPersonal;
	private ShowPersonal informationPersonal;
	private EditPersonal ePersonal;

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
		addWindowListener(this);
	}
	public void intanciarPaneles() {
		pTiposIngenieros = new EngineerWindow(this);
		pSalaryEnginieers = new SalaryWindow(this);
		aEngineerSenior = new AddEngineerSenior(this);
		aEnginnerJunior = new AddEnginerJunior(this);
		aPersonalComission = new AddPersonalComission(this);

		aPersonalComission = new AddPersonalComission(this);
		listaPersonal = new ListaPersonal(this);
		informationPersonal = new ShowPersonal(this);


		ePersonal = new EditPersonal(this);



		listaPersonal = new ListaPersonal(this);
		informationPersonal = new ShowPersonal(this);
		ePersonal = new EditPersonal(this);
	}


	public void ocultarPaneles() {
		pTiposIngenieros.setVisible(false);
		pSalaryEnginieers.setVisible(false);
		aEngineerSenior.setVisible(false);
		aEnginnerJunior.setVisible(false);
		aPersonalComission.setVisible(false);
		informationPersonal.setVisible(false);
		ePersonal.setVisible(false);
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
			listaPersonal.setVisible(false);
			setVisible(true);

			informationPersonal.getTxtapellido().setText("");
			informationPersonal.getTxtnombre().setText("");
			informationPersonal.getTxtcedula().setText("");
			informationPersonal.getTxtdireccion().setText("");
			informationPersonal.getTxtcorreo().setText("");
			informationPersonal.getTxttelefono().setText("");
		}
		if (accion == "Ingeniero por Comision") {
			listaPersonal = new ListaPersonal(this);
			pTiposIngenieros.setVisible(false);
			listaPersonal.iniciarBotones("Comission");
			listaPersonal.setVisible(true);
		}
		if (accion == "Ingeniero por Salario") {
			pTiposIngenieros.setVisible(false);
			pSalaryEnginieers.setVisible(true);
		}
		if( accion == "Ingenieros Senior") {
			listaPersonal = new ListaPersonal(this);
			pSalaryEnginieers.setVisible(false);
			listaPersonal.iniciarBotones("Senior");
			listaPersonal.setVisible(true);
		}
		if(accion == "Ingenieros Junior") {
			listaPersonal = new ListaPersonal(this);
			pSalaryEnginieers.setVisible(false);
			listaPersonal.iniciarBotones("Junior");
			listaPersonal.setVisible(true);
		}
		if(accion == "agregar Senior") {
			if(aEngineerSenior.getTxtnombre().getText().length()!=0 && aEngineerSenior.getTxtapellido().getText().length()!=0 
					&& aEngineerSenior.getTxtcedula().getText().length()!=0 && aEngineerSenior.getTxtcorreo().getText().length()!=0
					&& aEngineerSenior.getTxtdireccion().getText().length()!=0 && aEngineerSenior.getTxtnventas().getText().length()!=0
					&& aEngineerSenior.getTxtcedula().getText().matches("[0-9]+") && aEngineerSenior.getTxtapellido().getText().matches("[a-zA-Z]+")
					&& aEngineerSenior.getTxtnombre().getText().matches("[a-zA-Z]+") && aEngineerSenior.getTxtnventas().getText().matches("[0-9]+")
					&& aEngineerSenior.getTxttelefono().getText().matches("[0-9]+") && controlador.verificarCorreo(aEngineerSenior.getTxtcorreo().getText())) {

				int anio = (int) aEngineerSenior.getComboAnio().getSelectedItem();
				char genero = (char) aEngineerSenior.getComboGenero().getSelectedItem();
				if (controlador.agregarSenior(aEngineerSenior.getTxtcedula().getText(), aEngineerSenior.getTxtnombre().getText(),
						aEngineerSenior.getTxtapellido().getText(), genero, aEngineerSenior.getTxttelefono().getText(),
						0, aEngineerSenior.getTxtcorreo().getText(), aEngineerSenior.getTxtdireccion().getText(),
						anio, Integer.parseInt(aEngineerSenior.getTxtnventas().getText()))) {
					controlador.converger();
					aEngineerSenior.setVisible(false);
					listaPersonal = new ListaPersonal(this);
					listaPersonal.iniciarBotones("Senior");
					listaPersonal.setVisible(true);

				}

			}
			else {
				JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE BIEN LOS DATOS");
			}
		}
		if(accion == "agregar Junior") {
			if(aEnginnerJunior.getTxtnombre().getText().length()!=0 && aEnginnerJunior.getTxtapellido().getText().length()!=0 
					&& aEnginnerJunior.getTxtcedula().getText().length()!=0 && aEnginnerJunior.getTxtcorreo().getText().length()!=0
					&& aEnginnerJunior.getTxtdireccion().getText().length()!=0 && aEnginnerJunior.getTxtcedula().getText().matches("[0-9]+") 
					&& aEnginnerJunior.getTxtapellido().getText().matches("[a-zA-Z]+") && aEnginnerJunior.getTxtnombre().getText().matches("[a-zA-Z]+")
					&& aEnginnerJunior.getTxttelefono().getText().matches("[0-9]+") && controlador.verificarCorreo(aEnginnerJunior.getTxtcorreo().getText())) {

				int anio = (int) aEnginnerJunior.getComboAnio().getSelectedItem();
				char genero = (char) aEnginnerJunior.getComboGenero().getSelectedItem();
				int level = (int) aEnginnerJunior.getComboNivel().getSelectedItem();
				if (controlador.agregarJunior(aEnginnerJunior.getTxtcedula().getText(), aEnginnerJunior.getTxtnombre().getText(),
						aEnginnerJunior.getTxtapellido().getText(), genero, aEnginnerJunior.getTxttelefono().getText(),0, aEnginnerJunior.getTxtcorreo().getText(),
						aEnginnerJunior.getTxtdireccion().getText(), anio, level)) {
					aEnginnerJunior.setVisible(false);
					listaPersonal = new ListaPersonal(this);
					listaPersonal.iniciarBotones("Junior");
					listaPersonal.setVisible(true);

				}
				aEnginnerJunior.getTxtapellido().setText("");
				aEnginnerJunior.getTxtnombre().setText("");
				aEnginnerJunior.getTxtcedula().setText("");
				aEnginnerJunior.getTxtdireccion().setText("");
				aEnginnerJunior.getTxtcorreo().setText("");
				aEnginnerJunior.getTxttelefono().setText("");
			}else {
				JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE BIEN LOS DATOS");
			}
		}
		if(accion == "agregar Comission") {
			if(aPersonalComission.getTxtnombre().getText().length()!=0 && aPersonalComission.getTxtapellido().getText().length()!=0 
					&& aPersonalComission.getTxtcedula().getText().length()!=0 && aPersonalComission.getTxtcorreo().getText().length()!=0
					&& aPersonalComission.getTxtdireccion().getText().length()!=0 && aPersonalComission.getTxtventa().getText().length()!=0
					&& aPersonalComission.getTxtcedula().getText().matches("[0-9]+") && aPersonalComission.getTxtapellido().getText().matches("[a-zA-Z]+")
					&& aPersonalComission.getTxtnombre().getText().matches("[a-zA-Z]+") && aPersonalComission.getTxtventa().getText().matches("[0-9]+")
					&& aPersonalComission.getTxttelefono().getText().matches("[0-9]+") && controlador.verificarCorreo(aPersonalComission.getTxtcorreo().getText())) {
				int anio = (int) aPersonalComission.getComboAnio().getSelectedItem();
				char genero = (char) aPersonalComission.getComboGenero().getSelectedItem();
				if (controlador.agregarComission(aPersonalComission.getTxtcedula().getText(), aPersonalComission.getTxtnombre().getText(), aPersonalComission.getTxtapellido().getText(),
						genero, aPersonalComission.getTxttelefono().getText(), 0, aPersonalComission.getTxtcorreo().getText(), aPersonalComission.getTxtdireccion().getText(),
						anio, Double.parseDouble(aPersonalComission.getTxtventa().getText()))) {
					aPersonalComission.setVisible(false);
					listaPersonal = new ListaPersonal(this);
					listaPersonal.iniciarBotones("Comission");
					listaPersonal.setVisible(true);
				}
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


		if (accion == "Mostrar") {

			listaPersonal.setVisible(false);
			informationPersonal.cargarInformacion(controlador.buscar(listaPersonal.getListaCedula().getSelectedValue()));
			informationPersonal.setVisible(true);

			if (listaPersonal.getListaCedula().getSelectedValue() != null){
				listaPersonal.setVisible(false);
				informationPersonal.cargarInformacion(controlador.buscar(listaPersonal.getListaCedula().getSelectedValue()));
				informationPersonal.setVisible(true);
			}
			else {
				JOptionPane.showMessageDialog(null, "Seleccione una cedula");
			}

		}
		if(accion == "Modificar") {
			if(listaPersonal.getListaCedula().getSelectedValue() != null) {
				ePersonal.setVisible(true);
				listaPersonal.setVisible(false);
				Personal pe = controlador.buscar(listaPersonal.getListaCedula().getSelectedValue());
				ePersonal.getTxtnombre().setText(pe.getNombre());
				ePersonal.getTxtcedula().setText(pe.getCedula());
				ePersonal.getTxtcedula().setEditable(false);
				ePersonal.getTxtapellido().setText(pe.getApellido());
				ePersonal.getTxtcorreo().setText(pe.getCorreo());
				ePersonal.getTxtdireccion().setText(pe.getDireccion());
				ePersonal.getTxttelefono().setText(pe.getTelefono());
			}
			else {
				JOptionPane.showMessageDialog(null, "Seleccione una cedula");
			}


		}

		if(accion== "editar") {
			if (ePersonal.getTxtnombre().getText().length()!=0 && ePersonal.getTxtapellido().getText().length()!=0 
					&& ePersonal.getTxtcedula().getText().length()!=0 && ePersonal.getTxtcorreo().getText().length()!=0
					&& ePersonal.getTxtdireccion().getText().length()!=0 && /*ePersonal.getTxtventa().getText().length()!=0
					&&*/ ePersonal.getTxtcedula().getText().matches("[0-9]+") && ePersonal.getTxtapellido().getText().matches("[a-zA-Z]+")
					&& ePersonal.getTxtnombre().getText().matches("[a-zA-Z]+") /*&& ePersonal.getTxtventa().getText().matches("[0-9]+")*/
					&& ePersonal.getTxttelefono().getText().matches("[0-9]+") && controlador.verificarCorreo(ePersonal.getTxtcorreo().getText())) {


				if (controlador.modificar(listaPersonal.getListaCedula().getSelectedValue(), ePersonal.getTxtnombre().getText(), ePersonal.getTxtapellido().getText(),
                        ePersonal.getTxttelefono().getText(), ePersonal.getTxtcorreo().getText(),
                        ePersonal.getTxtdireccion().getText(), ePersonal.getComboAnio().getSelectedItem().toString()))
				{
					JOptionPane.showMessageDialog(null, "Cambios Realizados Extitosamente");
					ePersonal.setVisible(false);
					String tipo = listaPersonal.getTipoPersonal();
					listaPersonal = new ListaPersonal(this);
					listaPersonal.iniciarBotones(tipo);
					listaPersonal.setVisible(true);

				}
				else {
					JOptionPane.showMessageDialog(null, "Error");
					ePersonal.setVisible(false);
					listaPersonal.setVisible(true);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Digite los Datos correctamente");
			}
		}
		if(accion == "EliminarComission") {
			if(controlador.eliminar(listaPersonal.getListaCedula().getSelectedValue())) {
				JOptionPane.showMessageDialog(null, "SE HA ELIMINADO");
				listaPersonal.setVisible(false);
				listaPersonal = new ListaPersonal(this);
				listaPersonal.iniciarBotones("Comission");
				listaPersonal.setVisible(true);

			}
			else {
				JOptionPane.showMessageDialog(null, "NO SE HA ELIMINADO");
			}
			if(accion == "EliminarJunior") {
				if(controlador.eliminar(listaPersonal.getListaCedula().getSelectedValue())) {
					JOptionPane.showMessageDialog(null, "SE HA ELIMINADO");
					listaPersonal.setVisible(false);
					listaPersonal = new ListaPersonal(this);
					listaPersonal.iniciarBotones("Junior");
					listaPersonal.setVisible(true);

				}
				else {
					JOptionPane.showMessageDialog(null, "NO SE HA ELIMINADO");
				}
				if(accion == "EliminarSenior") {
					if(controlador.eliminar(listaPersonal.getListaCedula().getSelectedValue())) {
						JOptionPane.showMessageDialog(null, "SE HA ELIMINADO");
						listaPersonal.setVisible(false);
						listaPersonal = new ListaPersonal(this);
						listaPersonal.iniciarBotones("Senior");
						listaPersonal.setVisible(true);

					}
					else {
						JOptionPane.showMessageDialog(null, "NO SE HA ELIMINADO");
					}
				}

			}
		}
		if(accion == "modificar") {
			ePersonal.setVisible(true);
			listaPersonal.setVisible(false);
			Personal pe = controlador.buscar(listaPersonal.getListaCedula().getSelectedValue());
			ePersonal.getTxtnombre().setText(pe.getNombre());
			ePersonal.getTxtapellido().setText(pe.getApellido());
			ePersonal.getTxtcorreo().setText(pe.getCorreo());
			ePersonal.getTxtdireccion().setText(pe.getDireccion());
			ePersonal.getTxttelefono().setText(pe.getTelefono());


		}

	}

public Controller getControlador() {
	return controlador;
}
@Override
public void windowActivated(WindowEvent arg0) {
	// TODO Auto-generated method stub

}
@Override
public void windowClosed(WindowEvent arg0) {

}
@Override
public void windowClosing(WindowEvent arg0) {
	JOptionPane.showMessageDialog(null, "Hasta Luego");
	controlador.converger();
	controlador.getM().getPersistencia().actualizarPersonal(controlador.getM().getPersonal());

}
@Override
public void windowDeactivated(WindowEvent arg0) {
	// TODO Auto-generated method stub

}
@Override
public void windowDeiconified(WindowEvent arg0) {
	// TODO Auto-generated method stub

}
@Override
public void windowIconified(WindowEvent arg0) {
	// TODO Auto-generated method stub

}
@Override
public void windowOpened(WindowEvent arg0) {
	// TODO Auto-generated method stub

}
}