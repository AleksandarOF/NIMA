package edu.fra.uas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lineChart")
public class LineChart {
	@Id
	@GeneratedValue
	private long id;

	// Definition of data fields for the x and y values
	@Column(name = "wertx")
	private Integer ValueX;

	@Column(name = "werty")
	private Integer ValueY;

	public LineChart() {

	}

	// Constructor to initialize data fields for x and y values
	public LineChart(Integer valueX, Integer valueY) {
		super();
		this.ValueX = valueX;
		this.ValueY = valueY;
	}

	// getters and setters
	public Integer getValueX() {
		return ValueX;
	}

	public void setValueX(Integer valueX) {
		ValueX = valueX;
	}

	public Integer getValueY() {
		return ValueY;
	}

	public void setValueY(Integer valueY) {
		ValueY = valueY;
	}

	public long getId() {
		return id;
	}

}
