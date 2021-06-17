package com.Recuperacion.Recuperacion.Clases;

import java.util.List;



import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;


@PersistenceCapable
@Inheritance(strategy = InheritanceStrategy.NEW_TABLE)

public class Usuario {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.INCREMENT)
	private int idUsuario;
	private String nombre;
	private String pw;
	private List<Tarea> tareasPendientes;
	
	
	
	public Usuario(String nombre, String pw) {
		super();
		
		this.nombre = nombre;
		this.pw = pw;
		
	}
	
	public Usuario() {
		super();
		
		this.nombre = "";
		this.pw = "";
		
	}

	public int getId() {
		return idUsuario;
	}

	public void setId(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public List<Tarea> getTareasPendientes() {
		return tareasPendientes;
	}

	public void setTareasPendientes(List<Tarea> tareasPendientes) {
		this.tareasPendientes = tareasPendientes;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", pw=" + pw + ", tareasPendientes="
				+ tareasPendientes + "]";
	}
	
	
	
}
