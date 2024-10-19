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
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo_cliente;
	
	@Column(name="nombreCliente", length=40, nullable= false)
	private String nombre_cliente;
	
	@Column(name="apellidoPaterno",  length=30, nullable= false)
	private String apellido_paterno;
	
	@Column(name="apellidoMaterno", length=40, nullable= false)
	private String apellido_materno;
	
	@Column(name="documento", length=8, nullable= false)
	private String documento;
	
	@ManyToOne
	@JoinColumn(name="Ciudad")
	private Ciudad ciudad;
	
	public Cliente() {
		
	}

	public Cliente(int codigo_cliente, String nombre_cliente, String apellido_paterno, String apellido_materno,
			String documento, Ciudad ciudad) {
		this.codigo_cliente = codigo_cliente;
		this.nombre_cliente = nombre_cliente;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.documento = documento;
		this.ciudad = ciudad;
	}

	public int getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(int codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
	
}
