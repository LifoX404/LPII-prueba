package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="mascotas")
public class Mascota {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id_mascotas;
	
	@Column(name="nombre", length= 45, nullable= false)
	private String nombre;
	
	@Column(name="raza", length=45, nullable=false)
	private String raza;
	
	@Column(name="genero", length=45, nullable=false)
	private String genero;
	
	@ManyToOne
	@JoinColumn(name="cedula")
	private Profesor profesor;
	
	public Mascota() {
		
	}

	public Mascota(Integer id_mascotas, String nombre, String raza, String genero, Profesor profesor) {
		this.id_mascotas = id_mascotas;
		this.nombre = nombre;
		this.raza = raza;
		this.genero = genero;
		this.profesor = profesor;
	}

	public Integer getId_mascotas() {
		return id_mascotas;
	}

	public void setId_mascotas(Integer id_mascotas) {
		this.id_mascotas = id_mascotas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	
	
	
	
	
	
	

}
