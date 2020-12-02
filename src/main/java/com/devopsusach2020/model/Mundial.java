package com.devopsusach2020.model;

import java.io.Serializable;

/**
 * clase que representa el objeto mundial
 * @author ABMUNOZ
 *
 */
public class Mundial implements Serializable {

	/**
	 * serializacion de clase
	 */
	private static final long serialVersionUID = 3908000903498620526L;
	
	/**
	 * definicion de atributos
	 */
	private int totalconfirmed;
	private int totaldeaths;
	private int totalrecovered;
	
	/**
	 * metodos accesadores
	 * 
	 */
	public int getTotalConfirmed() {
		return totalconfirmed;
	}
	public void setTotalConfirmed(int totalConfirmed) {
		this.totalconfirmed = totalConfirmed;
	}
	public int getTotalDeaths() {
		return totaldeaths;
	}
	public void setTotalDeaths(int totalDeaths) {
		this.totaldeaths = totalDeaths;
	}
	public int getTotalRecovered() {
		return totalrecovered;
	}
	public void setTotalRecovered(int totalRecovered) {
		this.totalrecovered = totalRecovered;
	}	

}
