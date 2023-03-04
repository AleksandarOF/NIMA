package edu.fra.uas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scatterpointchart")
public class ScatterPointChart {
	@Id
	@GeneratedValue
	private long id;

	// Definition of data fields for the x and y values
	@Column(name = "lable")
	private String Lable;

	@Column(name = "wert")
	private Integer Value;

	public ScatterPointChart() {

	}

	// Constructor to initialize data fields for x and y values
	public ScatterPointChart(String lable, Integer value) {
		super();
		Lable = lable;
		this.Value = value;
	}

	// getters and setters
	public String getLabel() {
		return Lable;
	}

	public void setLabel(String lable) {
		Lable = lable;
	}

	public Integer getwert() {
		return Value;
	}

	public void setwert(Integer value) {
		this.Value = value;
	}

	public long getId() {
		return id;
	}

}
