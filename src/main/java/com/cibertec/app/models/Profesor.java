package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="profesor")
public class Profesor {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int cedula;
	
	@Column(length=45, nullable=false)
	private String nombres;
	
	@Column(length=45, nullable=false)
	private String apellido;
	
	@Column(name="genero", length= 45, nullable=false)
	private String genero;
	
	public Profesor() {
		
	}

	public Profesor(int cedula, String nombres, String apellido, String genero) {
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellido = apellido;
		this.genero = genero;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	

}
