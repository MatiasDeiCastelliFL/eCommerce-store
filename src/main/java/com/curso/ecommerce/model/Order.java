package com.curso.ecommerce.model;

import java.sql.Date;

public class Order {
	private Integer id;
	private String numero;
	private Date dateCreate;
	private Date dateRecived;
	private double total;
	public Order() {}
	public Order(Integer id, String numero, Date dateCreate, Date dateRecived, double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.dateCreate = dateCreate;
		this.dateRecived = dateRecived;
		this.total = total;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getDateCreate() {
		return dateCreate;
	}
	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}
	public Date getDateRecived() {
		return dateRecived;
	}
	public void setDateRecived(Date dateRecived) {
		this.dateRecived = dateRecived;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "order [id=" + id + ", numero=" + numero + ", dateCreate=" + dateCreate + ", dateRecived=" + dateRecived
				+ ", total=" + total + "]";
	}
	
}
