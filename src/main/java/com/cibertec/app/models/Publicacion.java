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
@Table(name="publicacion")
public class Publicacion {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id_publicaciones;
	
	@Column(name="titulo", length=45, nullable=false)
	private String titulo;
	
	@Column(name="cuerpo", length=45, nullable= false)
	private String cuerpo;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	public Publicacion() {
		
	}

}
