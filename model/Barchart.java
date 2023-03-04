package edu.fra.uas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "barchart")
public class Barchart {
	@Id
	@GeneratedValue
	private long id;

	// Definition of data fields for the x and y values
	@Column(name = "lable")
	private String Label;

	@Column(name = "wert")
	private Integer Wert;

	public Barchart() {

	}

	// Constructor to initialize data fields for x and y parameters
	public Barchart(String label, Integer Wert) {
		super();
		Label = label;
		this.Wert = Wert;
	}

	// getters and setters
	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public Integer getwert() {
		return Wert;
	}

	public void setwert(Integer value) {
		this.Wert = value;
	}

	public long getId() {
		return id;
	}

}
