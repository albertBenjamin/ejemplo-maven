package com.devopsusach2020.model;

import java.io.Serializable;

/**
 * clase que representa el objeto Pais
 * @author ABMUNOZ
 *
 */
public class Pais implements Serializable{

	/**
	 * serializacion de la clase
	 */
	private static final long serialVersionUID = -2988002029080131424L;
	
	/**
	 * definicion de atributos
	 */
	private int deaths;
	private int confirmed;
	private String date;
	private String mensaje;
	private String country;
	private int recovered;
	private int active;
	
	/**
	 * metodos accesadores
	 */
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public int getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}
	public int getRecovered() {
		return recovered;
	}
	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}	
}
