package edu.fra.uas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tabelle")
public class Tabelle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Definition of data fields for the x and y values
	@Column(name = "value1")
	private Double Value1;

	@Column(name = "value2")
	private Double Value2;

	// add more fields for additional input fields as needed

	// constructor
	public Tabelle(Double value1, Double value2) {
		super();
		this.Value1 = value1;
		this.Value2 = value2;
	}

	// getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValue1() {
		return Value1;
	}

	public void setValue1(Double value1) {
		this.Value1 = value1;
	}

	public Double getValue2() {
		return Value2;
	}

	public void setValue2(Double value2) {
		this.Value2 = value2;
	}

	// add more getters and setters for additional input fields as needed
}