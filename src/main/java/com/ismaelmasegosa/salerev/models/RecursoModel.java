package com.ismaelmasegosa.salerev.models;

import com.ismaelmasegosa.salerev.entities.Horario;

public class RecursoModel {

	public String id;

	public String nombre;

	public String tipo;

	public String datos;

	public String incidencia;

	public int capacidad;

	public Horario intevalo;

	public RecursoModel(String id, String nombre, String tipo, String datos, String incidencia, int capacidad,
			Horario intevalo) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.datos = datos;
		this.incidencia = incidencia;
		this.capacidad = capacidad;
		this.intevalo = intevalo;
	}

	public RecursoModel() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDatos() {
		return datos;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}

	public String getIncidencia() {
		return incidencia;
	}

	public void setIncidencia(String incidencia) {
		this.incidencia = incidencia;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Horario getIntevalo() {
		return intevalo;
	}

	public void setIntevalo(Horario intevalo) {
		this.intevalo = intevalo;
	}

}
