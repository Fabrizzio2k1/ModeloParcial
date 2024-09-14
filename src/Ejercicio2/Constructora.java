package Ejercicio2;

import java.time.LocalDate;

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
	
	
}
