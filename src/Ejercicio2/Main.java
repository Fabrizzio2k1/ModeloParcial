package Ejercicio2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructora c1 = new Constructora();
		String menu [] = {"Crear Proyecto", "Evaluar Etapas", "Ver Etapas", "Revisar Proyecto" , "Salir"};
		int opcion;
		
		do {
			opcion = JOptionPane.showOptionDialog(null, "Elija una Opción", null, 0, 0, null, menu, menu[0]);
			switch (opcion) {
			case 0: {
				c1.crearProyecto();
				break;
			}
			case 3: {
				JOptionPane.showMessageDialog(null, c1);
				break;
			}
			default:
			}
		} while (opcion!=4);
		
	}

}
