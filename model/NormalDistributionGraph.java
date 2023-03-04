package edu.fra.uas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NormalDistributionGraph")
public class NormalDistributionGraph {
	@Id
	@GeneratedValue
	private long id;

	// Definition of data fields for the x and y values
	@Column(name = "mean")
	private Float Mean;

	@Column(name = "sD")
	private Float SD;

	@Column(name = "x")
	private Float X;

	public NormalDistributionGraph() {

	}

	// Constructor to initialize data fields for x and y values
	public NormalDistributionGraph(Float mean, Float sD, Float x) {
		super();
		Mean = mean;
		SD = sD;
		X = x;

	}
	// getters and setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Float getMean() {
		return Mean;
	}

	public void setMean(Float mean) {
		Mean = mean;
	}

	public Float getSD() {
		return SD;
	}

	public void setSD(Float sD) {
		SD = sD;
	}

	public Float getX() {
		return X;
	}

	public void setX(Float x) {
		X = x;
	}

}
