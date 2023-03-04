package edu.fra.uas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dashboard")
public class Dashboard {
	@Id
	@GeneratedValue
	private long id;

	// Definition of data fields for the x and y values
	@Column(name = "valueX")
	private Integer ValueX;

	@Column(name = "valueY")
	private Integer ValueY;

	public Dashboard() {

	}

	// Constructor to initialize data fields for x and y values
	public Dashboard(Integer valueX, Integer valueY) {
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

	public void setWerty(Integer valueY) {
		ValueY = valueY;
	}

	public long getId() {
		return id;
	}

}
