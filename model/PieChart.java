package edu.fra.uas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pieChart")
public class PieChart {
	@Id
	@GeneratedValue
	private long id;

	// Definition of data fields for the x and y values
	@Column(name = "value")
	private Integer Value;

	public PieChart() {

	}

	// Constructor to initialize data fields for x and y values
	public PieChart(Integer value) {
		super();
		this.Value = value;
	}

	// getters and setters
	public Integer getValue() {
		return Value;
	}

	public void setValue(Integer value) {
		this.Value = value;
	}

	public long getId() {
		return id;
	}

}
