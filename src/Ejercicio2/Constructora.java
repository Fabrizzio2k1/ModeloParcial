package Ejercicio2;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Constructora {
	private String nombre;
	private String ubicacion;
	private String cliente;
	private LocalDate fechaInicio;
	private String Etapas;
	private LocalDate fechaProgreso;
	
	public Constructora() {
		this.nombre = "No ingresado";
		this.ubicacion = "No ingresado";
		this.cliente = "No ingresado";
		fechaInicio = LocalDate.now();
		Etapas = "No ingresado";
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
		return Etapas;
	}

	public void setEtapas(String etapas) {
		Etapas = etapas;
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
		boolean flag = false;
		String num = "";
		
		while (!flag) {
			num = JOptionPane.showInputDialog(mensaje);
			for (int i = 0; i < num.length(); i++) {
				if(!Character.isAlphabetic(num.charAt(i))) {
					flag = true;
					break;
				}
			}
		}
		
		return Integer.parseInt(num);
	}

	@Override
	public String toString() {
		return "Constructora [nombre=" + nombre + ", ubicacion=" + ubicacion + ", cliente=" + cliente + ", fechaInicio="
				+ fechaInicio + ", Etapas=" + Etapas + ", fechaProgreso=" + fechaProgreso + "]";
	}
	
	
}
