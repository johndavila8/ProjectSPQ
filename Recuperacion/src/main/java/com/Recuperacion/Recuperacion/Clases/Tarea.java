package com.Recuperacion.Recuperacion.Clases;
import java.util.Date;

import javax.jdo.annotations.*;
//import javax.jdo.annotations.PersistenceCapable;
//import javax.jdo.annotations.Persistent;
//import javax.jdo.annotations.PrimaryKey;


@PersistenceCapable
@Inheritance(strategy = InheritanceStrategy.NEW_TABLE)

public class Tarea {


	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.INCREMENT)
	
	private int idTarea;
	private String nombre;
	private Date fecha;
	private String descripcion;

	
	public Tarea(String nombre, Date fecha, String descripcion) {
		super();
		
		this.nombre = nombre;
		this.fecha = fecha;
		this.descripcion = descripcion;
		
	}

	public int getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	@Override
	public String toString() {
		return "Tarea [idTarea=" + idTarea + ", nombre=" + nombre + ", fecha=" + fecha + ", descripcion=" + descripcion
				+"]";
	}	
	
	
	
	
}
