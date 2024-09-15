package Ejercicio2;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Constructora {
	private String nombre;
	private String ubicacion;
	private String cliente;
	private LocalDate fechaInicio;
	private String etapas;
	private LocalDate fechaProgreso;
	
	public Constructora() {
		this.nombre = "No ingresado";
		this.ubicacion = "No ingresado";
		this.cliente = "No ingresado";
		fechaInicio = LocalDate.now();
		etapas = "Etapas: ";
		fechaProgreso = LocalDate.now();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getEtapas() {
		return etapas;
	}

	public void setEtapas(String etapas) {
		this.etapas = etapas;
	}

	public LocalDate getFechaProgreso() {
		return fechaProgreso;
	}

	public void setFechaProgreso(LocalDate fechaProgreso) {
		this.fechaProgreso = fechaProgreso;
	}
	
	public void crearProyecto() {
		this.nombre = validarCaracteres("Ingrese el nombre del proyecto");
		this.ubicacion = validarCaracteres("Ingrese la ubicación del proyecto");
		this.cliente = validarCaracteres("Ingrese el cliente del proyecto");
		this.fechaInicio = LocalDate.of(validarNumeros("Ingrese Año"),validarNumeros("Ingrese Mes"),validarNumeros("Ingrese Dia"));
		this.fechaProgreso = this.fechaInicio;
	}
	
	public String validarCaracteres(String mensaje) {
		String palabra = "";
		while (palabra.equals("")) {
			palabra = JOptionPane.showInputDialog(mensaje);
		}
		return palabra;
	}
	
	public int validarNumeros(String mensaje) {
		boolean flag;
		String num = "";
		do {
			flag = true;
			num = JOptionPane.showInputDialog(mensaje);
			while (num.isEmpty()) {
				num = JOptionPane.showInputDialog(mensaje);
			}
			for (int i = 0; i < num.length(); i++) {
				if(!Character.isDigit(num.charAt(i))) {
					flag = false;
					break;
				}
			}
		} while (!flag);
		return Integer.parseInt(num);
	}
	
	public void agregarEtapas() {
		String etapa = validarCaracteres("Ingrese el nombre de la etapa:");
		int calificacion = evaluarEtapas(etapa);
		fechaProgreso = fechaProgreso.plusDays(1);
		etapas = etapas + "\nNombre: " + etapa + " Calificación: " + calificacion + " Fecha: " + fechaProgreso;
	}
	
	public int evaluarEtapas(String etapa) {
		String validacion [] = {"1","2","3","4","5","6","7","8","9"};
		int opcion = JOptionPane.showOptionDialog(null, "Evalue su Etapa: "+etapa, null, 0, 0, null, validacion, validacion[0]);
		return opcion+1;
	}

	@Override
	public String toString() {
		return "Constructora [nombre=" + nombre + ", ubicacion=" + ubicacion + ", cliente=" + cliente + ", fechaInicio="
				+ fechaInicio + ", Etapas=" + etapas + ", fechaProgreso=" + fechaProgreso + "]";
	}
	
	
}
